package com.javastudy.exam.future;

import java.time.LocalTime;
import java.util.concurrent.*;

public class FutureSample {
    // 비동기적 연산의 처리 결과를 표현하기 위해 사용한다.
    // 시간이 걸릴 수 있는 작업을 Future 내부로 작성하고 호출자 스레드가 결과를 기다리는 동안 다른 유용한 작업을 할 수 있다.
    //출처: https://pjh3749.tistory.com/280 [JayTech의 기술 블로그:티스토리]

    // 비동기 처리가 완료되었는지 확인하고, 처리 완료를 기다리고, 처리 결과를 반환하는 메서드를 제공한다.
    // Future 구현체를 통해 로직을 만들어 실행하는 것이다.
    // synchronized block(동기화 블록)은 같은 객체에 대한 모든 동기화 블록은 한 시점에 오직 한 Thread만이 블록 안으로 접근하도록(실행하도록)하는 것이다.
    // Future를 이용하면 멀티 스레드 환경에서 처리된 어떤 데이터를 다른 스레드로 전달하여 실행하던지, 또는 지금 스레드에 전달할 수 있다.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //ExecutorService 초기화   'ExecutorService'는 작업의 효율적인 병렬 처리를 위해 제공되는 Java 라이브러리
        ExecutorService executor = Executors.newSingleThreadExecutor();

        //Callable Task 생성 새로운 스레드.
        // 결괏값이 없는 작업일 경우 Runnable을 사용하고, 결괏값이 있는 작업일 경우 Callable을 사용하는데, 결과가 리턴되어야 하는 경우가 많기 때문에 주로 Callable을 구현한 Task를 인자로 사용합니다.
        Callable<String> callableTask = () -> {
            System.out.println(LocalTime.now() + " Task Start");
            Thread.sleep(1000L);
            return "Task Result";

        };

        //submit() 메서드로 Task 실행
        Future<String> future = executor.submit(callableTask);

        System.out.println(LocalTime.now() + " Waiting the task done");
        System.out.println("isDone 1 = " + future.isDone());
        //  future.get() 작업된 결과를 가지고 오는 메서드입니다.
        //  만약 결과가 아직 리턴되지 않았다면 결과가 나올 때까지 기다립니다. 이때 중요한 점은 결과가 반환되기 전까지 애플리케이션의 진행을 'block' 한다는 것입니다.
        //  반환되지 않는다면 get() 메서드를 호출한 Thread는 무한히 대기하게 되고, 프로그램은 응답이 없는 상태가 됩니다.
        String result = future.get();  //Task 결과 대기
        System.out.println("isDone 2 = " + future.isDone());
        System.out.println(LocalTime.now() + " future.get() = " + result);

        System.out.println("end");
    }
}
