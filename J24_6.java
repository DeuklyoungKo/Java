import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
// 테스트 클래스
class Node24_6 {
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

public class J24_6 {
    // 스레드 sleep 함수 (sleep 함수의 Exception 제거용)
    private static void sleep() {
        try {
            // 스레드 1초 대기
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // 더하기 함수 - 확실히 동기화가 필요한 부분만 synchronized를 사용, synchronized 함수 안에서는 또 다른
    // synchronized가 없도록 주의
    private static synchronized void add(Node24_6 n1, Node24_6 n2, int i) {
        // 값을 가져와서
        int data = n1.getData();
        // i만큼 더한다.
        n1.setData(data + i);
        // 값을 가져와서
        data = n2.getData();
        // i만큼 더한다.
        n2.setData(data + i);
    }
    // 합산 함수
    private static void sum(Node24_6 n1, Node24_6 n2) {
        // 0부터 9까지 반복한다.
        for (int i = 0; i < 10; i++) {
            add(n1, n2, i);
            // 콘솔 출력
            System
                .out
                .println(Thread.currentThread().getName() + " i = " + i);
            // 스레드 1초 대기
            sleep();
        }
    }
    // 실행 함수
    public static void main(String[] args) {
        // 스레드풀 (최대 2개 생성)
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 두개의 값
        final Node24_6 Node24_61 = new Node24_6();
        final Node24_6 Node24_62 = new Node24_6();
        try {
            // 스레드 실행
            Future<?> f1 = service.submit(() -> {
                sum(Node24_61, Node24_62);
            });
            Future<?> f2 = service.submit(() -> {
                sum(Node24_62, Node24_61);
            });
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
            .println("Node24_61 data - " + Node24_61.getData());
        System
            .out
            .println("Node24_62 data - " + Node24_62.getData());
    }

}
