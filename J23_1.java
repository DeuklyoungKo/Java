import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class J23_1 {
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
    public static void main(String[] main) {

        // single 스레드풀 -> 스레드풀안에 스레드가 하나만 움직인다.
        ExecutorService service = Executors.newSingleThreadExecutor();

        // 스레드풀에 스레드를 돌린다.
        service.execute(() -> {
            // 0부터 9까지 반복문
            for(int i = 0; i < 10; i++) {
                // 콘솔 출력
                System.out.println(Thread.currentThread().getName() + " " + i);
                // 1초 대기
                sleep();
            }
        });

        // 스레드풀에 스레드를 돌린다.
        service.execute(() -> {
            // 0부터 9까지 반복문
            for(int i = 0; i < 10; i++) {
                // 콘솔 출력
                System.out.println(Thread.currentThread().getName() + " " + i);
                // 1초 대기
                sleep();
            }
        });
        
        // 스레드풀에 스레드를 돌린다.
        service.execute(() -> {
            // 0부터 9까지 반복문
            for(int i = 0; i < 10; i++) {
                // 콘솔 출력
                System.out.println(Thread.currentThread().getName() + " " + i);
                // 1초 대기
                sleep();
            }
        });
        // 스레드풀 안의 스레드가 모두 정상 종료되면 스레드풀 종료하기
        service.shutdown();
    }
}