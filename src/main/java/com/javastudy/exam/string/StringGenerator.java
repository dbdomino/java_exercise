package com.javastudy.exam.string;
// Strign 클래스 생성자와 유용한 String 매서드
/*
    String(String s)        주어진 문자열(s)를 갖는 String 인스턴스를 생성한다.
    -> String s = new String("Hello);              -> s = "hello"
    String(char[] value)    주어진 문자열(value)를 갖는 Strign 인스턴스 생성
    -> char[] c = {'H', 'E', 'L', 'L', 'O' }; String s = new String(c);   -> s = "HELLO"
    String(StringBuffer buf)  StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
    -> StringBuffer sb = new StringBuffer("Hello"); String s = new String(sb); s = "Hello"
    char charAt(int Index)  지정된 위치(index)에 있는 문자를 알려준다.
    -> String s = "Hello"; String n = 0123456"; char c1 = s.charAt(1); char c2 = n.charAt(1); -> c1 = 'e', c2 = '1'
    int compareTo(String str)  두개의 문자열을 사전 순서로 비교한다. 같으면 0을 사전순으로 왼쪽이 작으면 음수를, 왼쪽이 크면 양수를 반환한다.
    -> int i = "aaa".compareTo("aaa"); int i2 = "aaa".compareTo("bbb"); int i3 = "bbb".compareTo("aaa"); -> i=0 i2=-1 i3=1

    String concat(String str)   문자열을 뒤에 덧붙인다.
    -> String s = "hello"; String s2 = s.concat(" World");   -> s2 = "Hello World"
    // 인터페이스의 장점중 하나, 서로 관계없는 클래스들의 관계를 맺어줄 수 있다.
    boolean contains(CharSequence s) 지정된 문자열(s)이 포함되었는지 검사한다.  // interface CharSequence는 CharBuffer, segment, String, StringBuffer, StringBuilder 들을 지원하여 넣을 수 있다.
    -> String s = "abcdefg"; boolean b = s.contains("bc")   -> b = true
    boolean endsWith(String suffix)  지정된 문자열(suffix)로 끝나는지 검사한다.
    -> String file = "Hello.txt"; boolesn b= file.endsWith("txt");  -> b = true
    boolean equals(Object obj) 매개변수로 받은 문자열과 String 인스턴스의 문자열을 비교한다. obj가 String이 아니거나 문자열이 다르면 false 반환
    -> String s = "Hello"; boolean b = s.equals("hello"); boolean b2 = s.equals("hello"); -> b = true, b2 = false (값을 비교)
    boolean equalsIgnoreCase(String str)   문자열과 String 인스턴스의 문자열을 대소문자 구분없이 비교한다.
    -> String s = "Hello"; boolean b = s.equalsIgnoreCase("HELLO"); boolean b2 = s.equalsIgnoreCase("heLLo"); -> b = true, b2 = true
    int indexOf(int ch)    주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못 찾으면 -1을 반환한다.
    -> String s = "Hello"; int idx1 = s.indexOf('o'); int idx2 = s.indexOf('k');  -> idx1 = 4, idx2 = -1

    int indexOf(int ch, int pos)  주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다, 못찾으면 -1을 반환한다.
    -> String s = "Hello"; int idx1 = s.indexOf('e',0); int idx2 = s.indexOf('e',2);  -> idx1 = 1, idx2 = -1
    int indexOf(String ch)   주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 없으면 -1을 반환한다.
    -> String s = "ABCDEFG"; int idx = s.indexOf("CD");  int idx2 = s.indexOf("FH"); // idx = 2 , idx2 = -1
    int lastIndexOf(int ch)  indexOf와 같은데, 뒤에서부터 찾는다.
    -> String s = "java.lang.Object"; int idx = s.lastIndexOf('.');  int idx2 = s.lastIndexOf('H'); // idx = 9,  idx2 = -1
    int lastIndexOf(int ch)  indexOf와 같은데, 뒤에서부터 찾는다. String도 지원
    -> String s = "java.lang.Object"; int idx = s.lastIndexOf(".");  int idx2 = s.lastIndexOf("ang"); // idx = 9,  idx2 = 6
    int length()  문자열의 길이를 알려준다.,
    ->  String s = "java.lang.Object"; int length = s.length;  -> length = 16

    Stirng[] split(String regex)  regex -> 정규식(regular Expression), 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다.
    -> String animals = "dog, cat, bear"; String[] arr = animals.split(",");  -> arr[0] = "dog", arr[1] = "cat" , arr[2] = "bear"
    String[] split(String regex, int limit)   문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담아 반환한다., 단, 문자열 전체를 지정된 수(limit)로 자른다.
    -> String animals = "dog, cat, bear"; String[] arr = animals.split(",", 2);  -> arr[0] = "dog", arr[1] = "cat,bear"
    boolean startsWith(String prefix)   주어진 문자열(prefix)로 시작하는지 검사한다.
    -> String s = "java.lang.Object"; boolean b = s.startsWith("java"); boolean b2= s.startsWith("lang");  -> b = true, b2 = false
    String substring(int begin)         주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 얻는다. 이때, 시작위치의 문자는 범위에 포함되지만
    String substring(int begin, int end)  끝 위치의 문자는 포함되지 않는다.(begin <= x < end)
    -> String s =  "java.lang.Object"; String c = s.substring(10); String p = s.substring(5,9);   -> c = "Object" p = "lang"

    String toLowerCase()   String 에 저장된 모든 문자열을 소문자로 바꿈.
    -> String s = "Hello"; Stirng s1 = s.toLowerCase();   -> s1 = "hello"
    String toHigherCase()   String 에 저장된 모든 문자열을 소문자로 바꿈.
    -> String s = "Hello"; Stirng s1 = s.toUpperCase();   -> s1 = "HELLO"
    String trim()   문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이때 문자열 중간에 있는 공백은 제거되지 않는다.
    -> String s = "   Hello   world   "; String s1 = s.trim();   -> s1 = "Hello   world"  // 문자열은 바뀔수 없으므로 새로운 문자열이 만들어진 것
    static String valueOf(boolean b)   ->   String b = String.valueOf(true);   -> b = "true"
    static String valueOf(char c)      ->   String c = String.valueOf('a');    -> c = "a"
    static String valueOf(int i)       ->   String i = String.valueOf(100);    -> i = "100"
    static String valueOf(long l)      ->   String l = String.valueOf(100L);   -> l = "100"
    static String valueOf(float f)     ->   String f = String.valueOf(100f);   -> f = "100.0"
    static String valueOf(double d)    ->   String d = String.valueOf(100.0);  -> d = "100.0"
    static String valueOf(Object o)    ->   Java.Util.Date dd = new java.util.Date(); String date = String.valueOf(dd); // 참조변수  -> "Wed Jan 27 21:25:29 KST 2024" 참조변수도 가능, toString으로 나온 결과를 저장시킴
    지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우 toString()을 호출한 결과를 반환한다.


 */
public class StringGenerator {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
//        sb = sb + "hoho";
        sb.append("mono");
        System.out.println(sb);
        int i = "aaa".compareTo("aaa");int i2 = "aaa".compareTo("c"); int i3 = "bbb".compareTo("aaa");
//        System.out.println(i);
//        System.out.println(i2);
//        System.out.println(i3);
//        String s = "ABCDEFG"; int idx = s.indexOf("CD");  int idx2 = s.indexOf("FH");
//        String s = "java.lang.Object"; int idx = s.lastIndexOf('.');  int idx2 = s.lastIndexOf("H");
//        String s = "java.lang.Object"; int idx = s.lastIndexOf(".");  int idx2 = s.lastIndexOf("ang");
//        System.out.println(idx);
//        System.out.println(idx2);
//        String s =  "java.lang.Object"; String c = s.substring(10); String p = s.substring(5,9);
//        System.out.println(c); // object, index 10부터 쭉 나옴
//        System.out.println(p); // lang  index 5부터 8까지(end-1) 나옴
        String s = "   Hello   world   ";
        String s1 = s.trim();
        System.out.println(s1);
    }
}
