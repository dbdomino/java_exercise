##Comparator와Comparable

- 객체 정렬에 필요한 메서드(정렬기준 제공)를 정의한 인터페이스
- Comparable 기본 정렬기준을 구현하는데 사용.
- Comparator 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용

public interface Comparator {
int compare(Object 01, Object o2);   // o1, o2 를 비교한다는 뜻
boolean equals(Object obj); // equals 오버라이딩 해야 한다는 뜻

}
public interface Comparable {
int compareTo(Object o); // 주어진 객체 o 를 자신과 비교하는 메서드
}

- compare()와 compareTo() 는 두 객체의 비교결과를 반환하도록 작성,
- 같으면 0, 오른쪽이 크면 음수(0), 왼쪽이 크면 양수(+)

public int compareTo(Integer anotherInt) {
    int v1 = this.value;
    int v2 = anotherInt;

    // 같으면 0, 오른쪽게 크면 -1, 왼쪽이 크면 +1
    // 즉 오름차순 -> v1 - v2  -> v2 오른쪽이 크면 음수, 오름차순 -> 오른쪽이 크도록   
    // 즉 내림차순 -> v1 - v2  -> v2 왼쪽이 크면 양수,  내림차순-> 왼쪽이 크도록 -> 오른쪽값이 크면 자리바꿔야함
    return (v1 < v2 ? -1 :(v1 == v2 ? 0 : 1) ); 
}