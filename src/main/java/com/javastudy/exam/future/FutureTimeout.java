package com.javastudy.exam.future;

import java.time.LocalTime;
import java.util.concurrent.*;

public class FutureTimeout {
    // future.get(시간, 시간 형식)  으로 타임아웃 설정도 가능.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> callableTask = () -> {
            System.out.println(LocalTime.now() + " Task Start");
            Thread.sleep(2000L);
            System.out.println(LocalTime.now() + " Task End");
            return "Task Result";
        };

        Future<String> future = executor.submit(callableTask);

        System.out.println(LocalTime.now() + " Waiting the task done");
        String result = null;
        try {
            result = future.get(1000, TimeUnit.MILLISECONDS); // 핵심.
        } catch (TimeoutException e) {
            System.out.println(LocalTime.now() + " TimeoutException 발생");
        }
        System.out.println(LocalTime.now() + " future.get() = " + result);
    }
}
