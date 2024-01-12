package com.javastudy.exam.string;
// String 클래스 = 데이터(char[]) + 메서드(문자열 관련)
// 문자열과 문자열 메서드가 들어있다.
// String 클래스는 내용을 변경할 수 없는 불변(immutable) 클래스
/*  String a = "a"; String b = "b";
    a = a + b; -> 이렇게 됡 경우, String a에 연결된 값이 변경되는게 아니라,"ab" (0x300)라는 String 객체가 생성된 후 a로 주소가 매핑된다.
    "a" (0x100) 은 연결 끊기고 가비지컬랙터에 의해 사라짐, "b" (0x200)는 변경없으므로 그대로
    이게 반복되면 성능이 떨어질 수 있음
    문자열을 자주 수정 해야 한다면, 내용 변경이 가능한 StringBuffer를 이용해야 한다.
 */

// 문자열 리터럴 : 프로그램 실행시 자동으로 생성되며, constant pool에 저장됨.
// 같은 내용의 문자열 리터럴은 하나만 만들어진다.(String 객체는 불변 속성으로 내용 변경이 불가하다. 중요한 법칙...)
// str1 => "abc", str2 => "abc" 처럼 하나의 문자열이 여러 참조변수를 연결하여 쓰는 방식이다.

// 빈 문자열 "", empty String : 내용이 없는 문자열, 크기가 0인 char형 배열을 저장하는 문자열.
/* String str = "";  // str을 빈 문자열로 초기화 시킴, 내용이 없으며 길이가 0인 char형 배열을 저장하는 문자열.
크기가 0인 배열을 생성하는 것은 어느 타입이나 가능.
    char[] chArr = new char[0]; // 길이가 0인 char배열
    int[] iArr = {}; // 길이가 0인 int배열
*/
public class StringClass {
    public static void main(String[] args) {
        String str1 = "abc";   // 문자열 리터럴, 문자열 리터럴을 만들면 "abc"의 주소가 str1에 저장됨.
        String str2 = "abc";   // 문자열 리터럴, str2에서도 "abc" 주소를 저장함.
        String str3 = new String("abc"); // 항상 새로운 문자열 객체를 만듬
        String str4 = new String("abc"); // 항상 새로운 문자열 객체를 만듬.
        System.out.println(str1.equals(str2)); // 문자열을 비교할 때 equals를 쓰는 이유, 내용을 비교하기 때문,
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str1 == str2); // true   값을 비교하는게 아니라 주소를 비교하므로 이런 결과가 나옴
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false
        System.out.println(str1.hashCode()); //96354 , String value가 같으므로
        System.out.println(str2.hashCode()); //96354
        System.out.println(str3.hashCode()); //96354
        System.out.println(str4.hashCode()); //96354
        System.out.println(str1.hashCode() == str2.hashCode()); // true
        System.out.println(str2.hashCode() == str3.hashCode()); // true
        System.out.println(str3.hashCode() == str4.hashCode()); // true


    }
}
