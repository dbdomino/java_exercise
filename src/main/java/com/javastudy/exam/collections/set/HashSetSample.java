package com.javastudy.exam.collections.set;

// HashSet - 순서 X 중복 X
// 참고 list- 순서 O 중복 O  (배열느낌)
/* HashSet - Set 인터페이스를 구현한 대표적인 컬렉션 클래스,
  순서를 유지하려면, LinkedHashSet클래스를 사용하면 된다.

  TreeSet - 범위 검색과 정렬에 유리한 컬렉션 클래스
  대신 HashSet보다 데이터 추가, 삭제에 시간이 더 걸림
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSample {
    public static void main(String[] args) {
        // 여기서 문자열 "1"과 숫자 1은 중복으로 보지 않는다, 그래서 next() 에서 같은 값으로 보일 수 있는데
        // 혼동하지 않기 위해 일부러 예시에 추가했음.
        Object[] objArr = {"1",1,"2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i=0; i < objArr.length; i++) {
            set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
        }

        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);

        // HashSet에 저장된 요소들을 출력한다.(Iterator이용)
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
