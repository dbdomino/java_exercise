package com.javastudy.exam.string;

// String Buffer 클래스,
// String 처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
// 그러나 String과 달리 내용 변경을 할 있다. 배열 사이즈는 변경 불가능하다.
// 그러나 String Buffer에선 배열사이즈 변경을 내부적으로 지원한다.
/* 1. 임시 배열 사이즈 늘려서 생성한다.
   2. 기존 배열을 임시 배열로 복사한다.
   3. 배열의 참조를 임시배열로 지정한다.
   4. 기존 배열은 개비지콜랙터에 의해 제거된다.
   성능을 위해 배열 생성시 적절한 크기를 고려해서 미리 생성해 두는게 좋다.
   append(boolean, char, char[] double, float, int, long, Object obj, String str) -> String 으로 변환해서 넣음
   insert(위치, 글)
   delete(위치, 글)
   String Buffer는 equals가 오버라이딩 되어있지 않다. (주소로 비교한다).
   String Buffer끼리 비교하려면 toString으로 변환해서 비교하는게 좋다.
 */
// int capacity()   -> StringBuffer sb = new StringBuffer(100);
// sb.append("abcd");
/*
    int bufferSize = sb.capacity(); -> StringBuffer 인스턴스의 버퍼크기를 알려준다.
    int stringSize = sb.length();   -> StringBuffer 인스턴스의 버퍼에 담긴 문자열 길이를 알려준다.

    char charAt(int index)      -> 지정된 위치에 있는 문자를 반환한다.
    -> StringBuffer sb = new StringBuffer("abc"); char c = sb.charAt(2);   -> 지정된 위치(index)에 있는 문자를 반환한다.
    StringBuffer delete(int start, int end) -> 시작 위치부터 끝 위치(end)사이의 문자를 제거한다. 끝 위치 문자는 제외
    -> StringBuffer sb = new StringBuffer("abcdef"); StringBuffer sb2 = sb.delete(3,5); -> sb="abcf"  sb2="abdf"
    StringBuffer deleteCharAt(int index)   -> 지정된 위치(index)의 문자를 제거한다.
    ->  StringBuffer sb = new StringBuffer("0123456"); sb.deleteCharAt(3); -> sb="012456"

    StringBuffer insert(int pos, boolean b)    -> 인서트로 해당 위치(pos)다음에 추가됨
    StringBuffer insert(int pos, char c)        -> StringBuffer sb = new StringBuffer("0123456");
    StringBuffer insert(int pos, char[] str)    -> sb.insert(4,'.');
    StringBuffer insert(int pos, dboule d)      -> sb = "0123.456"
    StringBuffer insert(int pos, float f)
    StringBuffer insert(int pos, int i)
    StringBuffer insert(int pos, long l)
    StringBuffer insert(int pos, Object obj)
    StringBuffer insert(int pos, String str)
    int length   -> StringBuffer인스턴스에 저장되어 있는 문자열의 길이를 반환한다.
    ->  StringBuffer sb = new StringBuffer("0123456"); int length = sb.length(); -> length=7
    StringBuffer replace(int start, int end, String str)   -> 지정된 범위(start~end)의 문자들을 주어진 문자열로 바꾼다. end위치는 범위에 포함안됨
    ->  StringBuffer sb = new StringBuffer("0123456"); sb.replace(3, 6, "AB");   -> sb = "012AB6"
    StringBuffer reverse()   -> StringBuffer 인스턴스에 저장된 문자열의 순서를 거꾸로 바꾼다.
    ->  StringBuffer sb = new StringBuffer("0123456"); sb.reverse();   ->  sb = "6543210"

    void setCharAt(int index, char ch)  -> 지정된 위치의 문자를 주어진 문자(ch)로 바꾼다.
    ->  StringBuffer sb = new StringBuffer("0123456); sb.setCharAt(5, 'o');    -> sb = "01234o6";
    void setLength(int newLength)       -> 지정된 길이로 문자열의 길이를 변경한다. 길이를 늘리는 경우에 나머지 빈 공간을 널 문자 '\u0000'로 채운다
    ->  StringBuffer sb = new StringBuffer("0123456");  sb.setLength(5);
        StringBuffer sb2 = new StringBuffer("0123456"); sb2.setLength(10);
        String str = sb2.toString().trim();     -> sb = "01234", sb2="0123456   ", str = "0123456"
    String toString() -   -> StringBuffer 인스턴스의 문자열을 String으로 반환
    -> StringBuffer sb = new StringBuffer("0123456");  String str = sb.toString();   -> str = "0123456"
    String substring(int start)(int start, int end)   -> StringBuffer 인스턴스의 문자열을 자르는 것
    -> StringBuffer sb = new StringBuffer("0123456"); String str = sb.substring(3); String str2 = sb.substring(3,5);
                                                    str = "3456" , str2 = "34"

    StringBuffer sb = new StringBuffer("01");
    sb.append('4').append(56);  -> 이런식으로 append 한줄에 여러게 쓸 수 있는것-> 메서드 체이닝
 */

public class StringBuffers {

}
