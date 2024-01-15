package com.javastudy.exam.string;

// toString, Object값을 String으로 변환한다. valueOf 도 같은기능
// toString()과 같은 경우 Null PointerException(NPE)을 발생시키지만 valueOf는 "null"이라는 문자열로 처리한다.
// toString은 보통 Object객체에서 toString을 overriding 시켜 사용하지만
// valueOf는 String 에서 제공하는 메소드로 기본형 숫자를 문자열로 바꿀때 사용한다.
class SampleA {
    private String A;
    SampleA() {
        A = null;
    }
    SampleA(String a) {
        A = a;
    }
    public String toString() {
        return A;
    }
}

public class NullTest {
    public static void main(String[] args) {
        boolean b = false;
        int a = 15;
        long l = 16L; // 16도 되긴하지만
        float f = 16.1f;
        double d = 17.2;
        String sa= "hello";
        String se= "";
        String sn= null;
        String s;
        SampleA A = new SampleA();
        //실험1 null 반환시 에러 유무
        System.out.println(A.toString()); // toString() 결과가 null일 경우 null 리턴, System.out.println
//        System.out.println(null)); // System.out.println로 null 출력시 에러발생
        System.out.println((A.toString() == null)); // true, A.toString()은 null
        System.out.println(sn.equals(null)); //
//        System.out.println(A.toString().isEmpty()); // 런타임 에러, A.toString()은 null이며, null.isEmpty() 는 에러 발생
//        System.out.println(sn.isEmpty()); // 런타임 에러, sn은 null이며, null.isEmpty() 는 에러 발생, NullPointerException: Cannot invoke "String.isEmpty()" because "sn" is null
        System.out.println(("null".equals(A.toString()))); // false, A.toString()은 "null" 문자열이 아니다.
//        System.out.println((A.toString().equals(null))); // 런타임 에러, NullPointerException: Cannot invoke "String.equals(Object)"
        System.out.println("---------------------");

        //실험2 toString, valueOf null 처리 테스트
        String lowerCoatingVal1 = String.valueOf(sn); // valueOf에 null이 들어가면 null로 반환
//        String lowerCoatingVal2 = sn.toString(); // 런타임 에러, null.toString(); 은 에러발생한다.
        System.out.println(lowerCoatingVal1);
//        System.out.println(lowerCoatingVal2);
        System.out.println((lowerCoatingVal1 == null)); // false, lowerCoatingVal1은 null 이 아니다.
        System.out.println(lowerCoatingVal1.isEmpty()); // false, lowerCoatingVal1은 null 이 아니다.
        System.out.println("null".equals(lowerCoatingVal1)); // true, lowerCoatingVal1은 "null" 문자열 이다.
        System.out.println("---------------------");

        //실험3 출력 테스트
        System.out.println(sa); // hello 리턴
        System.out.println(se); //     공백 리턴
        System.out.println(sn); // null 리턴
//        System.out.println(s); // 에러
//        System.out.println(String.valueOf(null)); //에러, NullPointerException: Cannot read the array length because "value" is null
        System.out.println(String.valueOf(a)); //
        System.out.println(String.valueOf(l)); //
        System.out.println(String.valueOf(f)); //
        System.out.println(String.valueOf(d)); //
    }
}
