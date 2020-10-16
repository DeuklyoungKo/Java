import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class J23_4 {
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
        // 스레드를 2개만 사용 가능한 스레드풀을 생성한다.
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 스레드풀에 스레드를 돌린다.
        Future<Integer> data1 = service.submit(() -> {
            // 합산 결과
            int sum = 0;
            // 0부터 9까지 반복문
            for (int i = 0; i < 10; i++) {
                // 콘솔 출력
                System
                    .out
                    .println(Thread.currentThread().getName() + " " + i);
                // 합산
                sum += i;
                // 스레드 1초 대기
                sleep();
            }
            // 결과 리턴
            return sum;
        });
        // 스레드풀에 스레드를 돌린다.
        Future<Integer> data2 = service.submit(() -> {
            // 합산 결과
            int sum = 0;
            // 10부터 19까지 반복문
            for (int i = 10; i < 20; i++) {
                // 콘솔 출력
                System
                    .out
                    .println(Thread.currentThread().getName() + " " + i);
                // 합산
                sum += i;
                // 스레드 1초 대기
                sleep();
            }
            // 결과 리턴
            return sum;
        });
        // 스레드풀에 스레드를 돌린다.
        Future<Integer> data3 = service.submit(() -> {
            // 합산 결과
            int sum = 0;
            // 20부터 29까지 반복문
            for (int i = 20; i < 30; i++) {
                // 콘솔 출력
                System
                    .out
                    .println(Thread.currentThread().getName() + " " + i);
                // 합산
                sum += i;
                // 스레드 1초 대기
                sleep();
            }
            // 결과 리턴
            return sum;
        });
        try {

            // data3의 스레드가 끝날때까지 기다린다. 두번째 스레드 값 결과를 콘솔 출력
            System.out.println(data2.get());

            // 세번째 스레드 값 결과를 콘솔 출력
            System.out.println(data3.get());
            // 첫번째 스레드 값 결과를 콘솔 출력
            System.out.println(data1.get());
        } catch (Throwable e) {
            // 에러 발생시 콘솔 출력
            e.printStackTrace();
        }
        // 스레드풀 안의 스레드가 모두 정상 종료되면 스레드풀 종료하기
        service.shutdown();
    }

}
