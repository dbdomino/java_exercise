package com.javastudy.exam.collections.stackqueue;

import java.util.*;

// 최근 입력한 history5개 보여주는 프로그램
public class QueueEX2 {
    static Queue q = new LinkedList(); // 즉 java에서 queue는 LinkedList()로 구현한다라.... Queue 인터페이스 눌러보면 Queue implementations generally do not allow insertion of null elements, although some implementations, such as LinkedList, do not prohibit insertion of null. Even in the implementations that permit it, null should not be inserted into a Queue, as null is also used as a special return value by the poll method to indicate that the queue contains no elements. 이런식으로나옴
    static final int MAX_SIZE = 5;	// Queue에 최대 5개까지만 저장되도록 한다.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        // add  poll remove
        //offer poll remove
        PriorityQueue pq = new PriorityQueue(); // 이것도 가능
        PriorityQueue<String> pq2 = new PriorityQueue(); // 이것도 가능

        while(true) {
            System.out.print(">>");
            try {
                // 화면으로부터 라인단위로 입력받는다.
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim(); // 공백제거

                if("".equals(input)) continue; // 빈값이면 다시입력받도록

                if(input.equalsIgnoreCase("q")) { // equalsIgnoreCase 대소문자 구분안하고 equals 확인
                    System.exit(0); // q입력시 종료
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 "
                            + MAX_SIZE +"개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    int i=0;
                    // 입력받은 명령어를 저장하고,
//                    save(input);

                    // LinkedList의 내용을 보여준다.
                    LinkedList tmp = (LinkedList)q;
                    ListIterator it = tmp.listIterator(); // LinkedList 객체에서 ListIterator로 생성가능
                    // ListIterator 인터페이스는 Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스.
                    // ListIterator 인터페이스는 List 인터페이스를 구현한 List 컬렉션 클래스에서만 listIterator() 메소드를 통해 사용할 수 있다.

//                    while(it.hasNext())
//                        System.out.println(++i+"."+it.next());

//                    for(int i = 0; i<list.size(); i++) { // 반복하는데 list.size() 계속 호출하는 것 보다,
                    final int Size = tmp.size();  // 이런식으로 한번 호출해서 아래 for에 적어주는게 더 효율저기다.
                    for(i = 0; i<Size; i++) {
                        System.out.println((i+1)+"."+it.next());
                    }

                } else {
                    save(input);
                    System.out.println(input);
                } // if(input.equalsIgnoreCase("q")) {
            } catch(Exception e) {
                System.out.println("입력오류입니다.");
            }
        } // while(true)
    } //  main()
    public static void save(String input) {
        // queue에 저장한다.
        if(!"".equals(input))  // !input.equals("")  랑 같은거임, input이 null이면 에러나니까 본문처럼 입력
            q.add(input); // add 추가 저장공간 부족하면 IllegalStateException 발생
//            q.offer(input); // offer add 추가

        // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
        if(q.size() > MAX_SIZE)  // size()는 Collection인터페이스에 정의
            q.poll();   // poll 꺼내기
//            q.remove();   // remove 꺼내기 비어있으면 NoSuchElementException발생
    }
}
