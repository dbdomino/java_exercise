package com.javastudy.exam.collections.comparator;

public class ComparableEx {
    public static void main(String[] args) {
        int a = 1;
        Integer aa = 1;
        int aaa = (Integer)1;
        int b = 2;
        Integer bb = 2;

        System.out.println("aa.compareTo(b) = "+aa.compareTo(b)); // aa < b 이므로  -1  비교한것보다 작으면 음수
        System.out.println("bb.compareTo(a) = "+bb.compareTo(a)); // bb > a 이므로   1  비교한것보다 크면 양수
        System.out.println("bb.compareTo(a) = "+bb.compareTo(a)); // bb > a 이므로   1  비교한것보다 크면 양수
    }
}
