package com.javastudy.exam.collections.set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetOverride {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc"); // HashSet에서 add메소드 호출시 equals와 hashCode로 중복 비교하므로, HashSet에 넣을 class는 equals와 hashCode메소드를 override
        // 해서 재정의 해줘야 바르게 동작함.
        set.add("abc");
        set.add(new Person("David",10)); // 객체 주소값이 다르므로 중복으로 체크 안될 수 있다보니 equals를 override 해줘야함.
        set.add(new Person("David",10));

        System.out.println(set);  // equals와 hashCode override 없으면 이렇게 출력됨. 논리적 오류 [abc, David:10, David:10]
        // 정상 [David:10, abc]
    }
}

// equals()와 hashCode()를 오버라이딩 해야 HashSet에서 바르게 동작함.
// generate 항목에서도 지원되는 부분이다.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        if ( !(o instanceof Person)) return false; // Person 으로 형변환불가하므로 일딴 같지않음.

        Person person = (Person) o;
        return name.equals(person.name) && age == person.age; // 맴버변수 같은지 비교, 같다면 같은 객체로 봐도됨.
//        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // 원하는 인스턴스 변수(iv) 넣기)
    }
}
