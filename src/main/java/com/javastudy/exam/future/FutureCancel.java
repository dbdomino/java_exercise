package com.javastudy.exam.future;

import java.time.LocalTime;
import java.util.concurrent.*;

public class FutureCancel {
    // future.cancel(true);
    // 현재 작업(Task)의 중단을 시도하는 메서드. 하지만 Task가 이미 완료되었다면 cancel() 메서드는 동작하지 않습니다.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> callableTask = () -> {
            System.out.println(LocalTime.now() + " Task Start");
            Thread.sleep(2000L);
            System.out.println(LocalTime.now() + " Task End");
            return "Task Result";
        };

        Future<String> future = executor.submit(callableTask); //
        Thread.sleep(1000L);
//        boolean cancelResult = future.cancel(true); // future를 캔슬 내버렸다. 취소함. 그렇다면, get()을 해올 수 없다.
        boolean cancelResult = future.cancel(false); // false 이면 스래드를 정지하지 않음.
        System.out.println("cancelResult = " + cancelResult); // Task의 동작을 취소했으면 true, 취소하지 못했다면 false를 리턴한다.
        System.out.println("isCancelled = " + future.isCancelled());

        String result = future.get();  // cancel() 되어서 get()할경우 CancellationException 발생
        // CancellationException은 작업이 취소되었기 때문에 FutureTask의 작업 결과를 가져올 수 없을 때 발생하는 예외
        System.out.println(LocalTime.now() + " future.get() = " + result);
    }
}
