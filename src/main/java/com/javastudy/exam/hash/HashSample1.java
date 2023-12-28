package com.javastudy.exam.hash;

import java.util.LinkedList;

class HashTable {
    class Node { // key, value 구조를 갖는 객체,
        String key;
        String value;
        public Node(String key, String value){
            this.key = key;
            this.value = value;
        }
        String value(){
            return value;
        }
        void value(String value){
            this.value = value;
        }
    }
    // 기본  Node로 이루어진 data 라는 배열로 안에 Node객체가 저장됨
    LinkedList[] data;

    // 생성자 배열 안에 key,value 기반 객체를 저장하는 식임
    HashTable(int size){
            this.data = new LinkedList[size];
    }
    // 키를 받아서 해시코드 반환
    int getHashCode(String key) {
        int hashcode = 0;
        for(char c : key.toCharArray()){
            hashcode += c;
        }
        return hashcode;
    }
    // 해시코드를 index로 변환
    int convertToIndex(int hashcode) {
        return hashcode % data.length; //해시코드를 배열방의 크기로 나눠 들어갈 인덱스 지정
    }
    // data 배열 방의 노드가 여러개일 경우 키로 검색하는 기능
    Node searchKey(LinkedList<Node> list, String key) {
        if (list == null) return null; // 배열방이 null이면 널반환
        for (Node node : list) { // 배열방의 키를 조회해서 같으면 반환
            if (node.key.equals(key)) {
                return node;
            }
        }
        return null; // 노드 없으면 null 반환
    }
    // 데이터를 받아서 저장하는 put 함수
    void put(String key, String value) {
        int hashcode = getHashCode(key); // key를 가지고 hash코드 만듬
        int index = convertToIndex(hashcode); // hash코드로 저장할 배열방 번호 가져옴
        LinkedList<Node> list = data[index]; // 배열방 번호로 기존 배열의 저장 정보 가져옴
        if (list == null) { // 배열방이 없다면 배열방 새로 생성
            list = new LinkedList<Node>(); // data라는 배열의 index마다 LinkedList<Node> 구조로 값을 저장시키는 구조를 띠게됨
            data[index] = list;
        }
        Node node = searchKey(list, key); // 배열방에 키 있는지 노드들을 확인해서 해당 노드 가져옴
        System.out.println(key + ", hashcode("+ hashcode+"), index(" + index + "), node("+node+")");// 로깅
        if (node == null) { // 노드 없으면 노드 생성해서 배열방에 추가
            list.addLast(new Node(key,value));// 배열의
        } else { // 노드 있으면 노드의 값을 대체해줌
            node.value(value);
        }
    }
    // key를 가지고 데이터를 가져오는 get 함수
    String get(String key) {
        int hashcode = getHashCode(key);  // key를 가지고 hash코드 만듬
        int index = convertToIndex(hashcode); // hash코드로 저장할 배열방 번호 가져옴
        LinkedList<Node> list = data[index]; //인덱스에서 linkedList 가져옴
        Node node = searchKey(list, key); // List에서 key를 검색해서 node 가져옴
        return node == null ? "Key Not found." : node.value(); //결과반환
    }

}
public class HashSample1 {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(4);
        hashTable.put("AA", "nice hellow AAA");
        hashTable.put("BB", "nice hellow BBBdds");
        hashTable.put("BB", "nice hellow BBBdd22222");
        hashTable.put("CCC", "nice hellow CCC");
        hashTable.put("DDD", "nice hellow DDD");
        hashTable.put("EEE", "nice hellow EEE");
        System.out.println(hashTable.getHashCode("AAA"));
        System.out.println(hashTable.convertToIndex(hashTable.getHashCode("AAA")));
        System.out.println(hashTable.get("AAA"));
        System.out.println(hashTable.get("BBB"));
        System.out.println(hashTable.get("CCC"));
        System.out.println(hashTable.get("DDD"));
        System.out.println(hashTable.get("EEE"));
        System.out.println(hashTable.get("FFF"));
        // 실제로 우리가 쓰는건 해시 테이블의 put과 get이지만,
        // 해시테이블: key 와 value 형식으로 값을 저장하고 불러오는데 해시 값으로 매핑시켜 key를 빠르게 찾을 수 있음
        // 해시 :데이터를 고정된 길이의 데이터로 변환된 값
    }
}
