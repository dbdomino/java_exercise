package com.javastudy.exam.thread;
//
/* 멀티스레드시
main-> 스레드A start() -> 스래드B start() -> 종료
       스레드A ->       스레드A ->       스레드A ->        -> 종료
               스래드B ->       스래드B ->       스래드B ->  종료
    cpu자원이 스레드A와 스레드B를 번갈아가며 작업을 할당함. 이걸 context switching 이라고 하며, 시간이 소요된다.
    싱글스레드보다 좀더 걸릴지 모르지만, 하나의 작업을 수행하며, 다른 작업을 동시에 할 수 있는것은 큰 장점이다.
 */
/* 싱글 스래드시
main -> 작업A -> 작업B -> 종료
 */

public class MultiThread {
}
