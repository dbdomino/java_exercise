package com.javastudy.exam.callback;

import javax.security.auth.callback.Callback;

// 자바에서 콜백(callback)은 비동기적인 작업의 완료나 이벤트 발생 등을 다룰 때 사용됩니다.
// 콜백은 메서드를 다른 메서드의 인수로 전달하고, 그 메서드가 완료되거나 이벤트가 발생하면 해당 메서드를 호출하여 결과를 처리합니다.

// 프로그래밍에서 콜백(callback) 또는 콜애프터 함수(call-after function)는 다른 코드의 인수로서 넘겨주는 실행 가능한 코드를 말한다.
// 익명함수로 만들어 넘기는 경우가 많습니다.
// 중요한건 클래스에서 직접 구현하거나 객체를 만들지 않고, 외부에서 받아 메서드를 수행하거나 하는 것입니다.
//
public class CallBackSample {
    public static void main(String[] args) {
        AsyncWorker worker = new AsyncWorker();
        // AsyncWorker 에서 담당하지 않는 함수를 실행하는 것이며, 비동기적으로 처리할 때 사용한다고 합니다.
        // 예를 들어 나중에 응답 결과를 받고싶을 때, 즉 비동기로 받고싶을 때 RunnableExample 소스처럼 또는 futureSample 소스처럼 구현해서 다른스레드 작업으로 던져놓고, 결과를 나중에 받아 쓴다.
        // 익명함수
        worker.doWork(new CallbackV() {
            @Override
            public void onComplete(String result) {
                System.out.println("작업 결과22: " + result);
            }
        });
        System.out.println("------------");
        //람다식표현
        worker.doWork(result -> {
            System.out.println("콜백함수 호출");
            System.out.println("작업 결과: " + result); }); // 람다식으로 표현한 callback 함수
    }
    public interface CallbackV {
        void onComplete(String result);
    }

    public static class AsyncWorker {
        public void doWork(CallbackV callback) {
            // 비동기 작업 수행
            String result = "작업 완료";
            // 작업 완료 후 콜백 호출
            callback.onComplete(result);
        }
    }

}
