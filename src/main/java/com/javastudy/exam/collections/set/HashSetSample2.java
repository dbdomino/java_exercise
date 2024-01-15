package com.javastudy.exam.collections.set;

import java.util.HashSet;
import java.util.Iterator;

// 합집합, 교집합, 차집합
public class HashSetSample2 {
    public static void main(String args[]) {
        HashSet setA   = new HashSet();
        HashSet setB   = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");	setA.add("2");  setA.add("3");  setA.add("4");  setA.add("5");
        System.out.println("A = "+setA);

        setB.add("4");	 setB.add("5");  setB.add("6"); setB.add("7");  setB.add("8");
        System.out.println("B = "+setB);

        // 교집합 A ∩ B =
        Iterator it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp))
                setKyo.add(tmp);
        }

        // 차집합 A - B
        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);
        }

        // 합집합 A U B =
        it = setA.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        it = setB.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        System.out.println("A ∩ B = " + setKyo);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A U B = " + setHab);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A - B = " + setCha);

//        setA.retainAll(setB); // 교집합, 공통된 요소만 남기고 setA의 요소 삭제
//        setA.addAll(setB);  // 합집합, setB의 요소 모두 추가 (중복 허용안해서 중복값은 안더해짐)
        setA.removeAll(setB); // 차집합, setB와 공통요소 제거
        System.out.println(setA);
    }
}
