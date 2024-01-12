package com.javastudy.exam.object;

// 모든 클래스의 최고 조상, 오직 11개의 메서드를 가지고 있다.
public class ObjectClass extends Object{
    /*
    protected Object clone()  객체 자신의 복사본을 반환
    public boolean equals(Object obj) 객체 자신과 객체 obj가 같은 객체인지 알려준다.(같으면 true)
    protected void finalize()    객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출된다. 거의 사용안함
    public Class getClass()     객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환한다.
    public int hashCode()       객체 자신의 해시코드를 반환한다.(고유값)
    public String toString()    객체 자신의 정보를 문자열로 반환한다.
    public void notify()        객체 자신을 사용하려고 기다리는 스레드를 하나만 깨운다.
    public void nitifyALL()     객체 자신을 사용하려고 기다리는 모든 스레드를 깨운다.
    public void wait()      다른 스레드나 notify()나 notifyALL() 을 호출할 때 까지 현재 스레드를 무한히, 지정된 시간(timeout, nanos)동안
                            기다리게 한다.(timeout은 천분의 1초, 1000 = 1초, nanos는 10^9분의 1초)
    public void wait(long timeout)
    public void wait(long timeout, int nanos)

     */
    public static void main(String[] args) {
        ObjectValue v1 = new ObjectValue(3);
        ObjectValue v2 = new ObjectValue(3);
        System.out.println(v1.equals(v2)); // 서로다른 객체는 항상 주소가 다르다. 주소값 비교하는게 object 클래스의 equals
        // 인스턴스 변수 값(iv)을 비교 하도록 equals를 overriding 해야 한다.

//        System.out.println(v1.hashCode()); // 1267032364 객체의 정수값을 만들어 반환 v1, v2의 해시코드 자리수는 다르다.
//        System.out.println(v2.hashCode()); // 661672156 // 객체마다 다른 값을 반환하므로 객체의 지문 이라고도 한다.
        String str1 = new String("abc");
        String str2 = new String("abc");
//        System.out.println(str1.equals(str2)); // 만약 이게 true면
//        System.out.println(str1.hashCode()); // hashCode()도 같은 값이다.
//        System.out.println(str2.hashCode()); // String 에서 equals는 주소값이 아닌 iv값으로 비교하도록 overriding 되어 있는 것이다.

        System.out.println(System.identityHashCode(str1)); // identityHashCode 를 쓰면 고유 HashCode 얻을 수 있다.

//        System.out.println(v1.toString()); //return getClass().getName() + "@" + Integer.toHexString(hashCode()); object 기본 형
        // overriding으로 바꿔줘야 한다.
        System.out.println(v1.toString());
    }
}
