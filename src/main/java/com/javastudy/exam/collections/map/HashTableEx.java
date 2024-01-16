package com.javastudy.exam.collections.map;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("myId", "1234");
        ht.put("asdf", "1111");
        ht.put("asdf", "1234");
        System.out.println(ht);
    }
}
