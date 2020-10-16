// Runnable 상속 받은 클래스
class Func implements Runnable {
    @Override
    public void run() {
        // 1부터 10까지 반복문
        for (int i = 1; i <= 10; i++) {
            // 콘솔 출력
            System
                .out
                .println("i - " + i);
        }
    }
}

public class J22_2 {
    // 실행 함수
    public static void main(String[] args) {
        try {
            // 스레드 할당
            Thread th = new Thread(new Func());
            // 스레드 실행
            th.start();
            // 1부터 10까지 반복문
            for (int i = 1; i <= 10; i++) {
                // 콘솔 출력
                System.out.println("i - " + i);
            }
        } catch (Throwable e) {
            // 에러 발생하면 콘솔 출력
            e.printStackTrace();
        }
    }

}
