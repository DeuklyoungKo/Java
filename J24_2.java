import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
// 테스트 클래스
class Node24_2 {
    // 멤버 변수
    public int data = 0;
    // 데이터 저장하기
    public void setData(int data) {
        // 멤버 변수 저장하기
        this.data = data;
    }
    // 변수 값 가져오기
    public int getData() {
        // 멤버 변수 가져오기
        return this.data;
    }
}

public class J24_2 {
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
        // 클로져를 위한 테스트 클래스
        final Node24_2 Node24_2 = new Node24_2();
        // 스레드에서 사용할 람다식
        Runnable func = () -> {
            // 0부터 9까지 반복한다.
            for(int i = 0; i < 10; i++) {
                // 값을 가져와서
                int data = Node24_2.getData();
                // i만큼 더한다.
                Node24_2.setData(data + i);
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
        // 0부터 9까지 2번 더한 값을 출력하라.
        System
            .out
            .println("Node24_2 data - " + Node24_2.getData());
    }

}
