package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.List;
// 최종 처리로 collect 예제, 커스텀 컬렉터 객체를 반환시키는 방법 예시
public class CustomCollectEx {
	public static void main(String[] args) {
		List<StudentEnum> totalList = Arrays.asList(
				new StudentEnum("마시루", 10, StudentEnum.Sex.MALE),
				new StudentEnum("유경", 6, StudentEnum.Sex.FEMALE),
				new StudentEnum("물림", 10, StudentEnum.Sex.MALE),
				new StudentEnum("효은", 6, StudentEnum.Sex.FEMALE)
		);
//		totalList.stream()
//				.filter(s -> s.getSex() == StudentEnum.Sex.MALE)
//				.collect(  // collect(Supplier, BiConsumer<R, ? super T> accumulate, BiConsumer<R, R> combiner )
//						()->new CustomCollect(), // Supplier, 커스텀 컬렉터 객체
//						(r, t) -> r.accumulate(t), // BiConsumer<R, ? super T>, 여기서 r은 new CustomCollect(), 사용자 정의 컨테이너, t는 필터링 된 요소다. 정의된 식이 ?에 해당할 것이다.
//						(r1, r2) -> r1.combine(r2) // combiner 싱글 스레드에선 사용되지 않는 매개변수이나, 병렬처리에선 사용되며, 컨테이너들을 결합하는 역할을 한다.
//				);
		// 싱글 스레드에서 실행, 콜렉트 진짜 어렵다.
		CustomCollect customCollect = totalList.stream()
				.filter(s -> s.getSex() == StudentEnum.Sex.MALE)
				.collect(  // collect(Supplier, BiConsumer<R, ? super T> accumulate, BiConsumer<R, R> combiner )
						()->new CustomCollect(), // Supplier, 커스텀 컬렉터 객체
						(r, t) -> r.accumulate(t), // BiConsumer<R, ? super T>, 여기서 r은 new CustomCollect(), 사용자 정의 컨테이너, t는 필터링 된 요소다. 정의된 식이 ?에 해당할 것이다.
						(r1, r2) -> r1.combine(r2) // combiner 싱글 스레드에선 사용되지 않는 매개변수이나, 병렬처리에선 사용되며, 컨테이너들을 결합하는 역할을 한다.
				);// 리턴으로 new CustomCollect() 를 반환

		customCollect.getList().stream()
				.forEach(s -> System.out.println(s.getName()));

////		CustomCollect maleStudent = totalList.stream()
////				.filter(s -> s.getSex() == StudentEnum.Sex.MALE)
////				//.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
////				.collect(()->new CustomCollect(), (r, t)->r.accumulate(t), (r1, r2)->r1.combine(r2));
//
////		maleStudent.getList().stream()
//				.forEach(s -> System.out.println(s.getName()));
	}
}
