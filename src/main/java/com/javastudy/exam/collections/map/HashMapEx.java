package com.javastudy.exam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        HashMap m = new HashMap<>();
        m.put("myId", "1234");
        m.put("asdf", "1111");
        m.put("asdf", "1234");
        map.put("키1", "값1");map.put("키2", "값2");map.put("키3", "값3");map.put("키4", "값4");map.put("키5", "값5");map.put("키6", "값6");

        if(m.containsKey("myId")) {  //containsKey(key) key 존재하는지 찾기 지원
            System.out.println("myId는 존재");
        } else {
            System.out.println("myId는 존재하지 않음");
        }

//        Set set = m.entrySet(); // entrySet()으로 Set으로 변환하여 Key기준으로 집합으로 가져오기 가능, key=value 형식으로 저장되며
//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            Object strori= it.next();
////            System.out.println(strori);
//            System.out.println(strori.toString());
////            String[] str = strori.split("=");
////            System.out.println(str[0]+ ", "+str[1]);
//        }

//        Set<String> setS =  m.entrySet(); // entrySet()으로 Set으로 변환하여 Key기준으로 집합으로 가져오기 가능, key=value 형식으로 저장되며
//        Iterator<String> itS = setS.iterator();
        Iterator<String> it1 = m.entrySet().iterator();
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        while(it1.hasNext()){
            String key= String.valueOf(it1.next());  // iterator() 의 값을 String으로 받으려면 valueOf 써야한다.
//            String key= String.valueOf(it2.next());
            System.out.println(key);
//            Object[] str = {strori, strori}; // strori 는 String 형식으로 형변환 불가능하다. key와 value의 조합으로 출력된
//            System.out.println(Arrays.toString(str));

//            String ori= (String) strori; // 불가능 iterator
//            System.out.println(strori);

//            String[] str = strori.split("=");
//            System.out.println(str[0]+ ", "+str[1]);
        }

        /*
        Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id :");
            String id = s.nextLine().trim();

            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {  //contains Key
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            if(!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        } // while
        */
    } // main의 끝
}
