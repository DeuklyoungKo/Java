import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class J24_1 {
    // 스레드 sleep 함수 (sleep 함수의 Exception 제거용)
    private static void sleep() {
        try {
            // 스레드 1초 대기
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // 실행 함수
    public static void main(String[] args) {
        // 스레드풀 (최대 2개 생성)
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 스레드에서 사용할 람다식
        Runnable func = () -> {
            // 0부터 9까지 반복문
            for(int i = 0; i < 10; i++) {
                // 콘솔 출력
                System
                    .out
                    .println(Thread.currentThread().getName() + " " + i);
                // 스레드 1초 대기
                sleep();
            }
        };
        try {
            // 스레드 실행
            Future<?> f1 = service.submit(func);
            Future<?> f2 = service.submit(func);
            // 스레드 종료될 때까지 대기
            f1.get();
            f2.get();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        // 스레드풀 안의 스레드가 모두 정상 종료되면 스레드풀 종료하기
        service.shutdown();
    }

}
