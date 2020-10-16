import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J25_3 implements Runnable {
    // 날짜 포멧
    private DateFormat format = new SimpleDateFormat("hh:MM:ss");
    // print 동기화 함수
    public synchronized void print() {
        try {
            // 콘솔 출력 현재 날짜.
            System
                .out
                .println(Thread.currentThread().getName() + " " + format.format(new Date()));
            // wait을 하면 다른 synchronized가 풀리게 된다. 즉, synchronized 내부에서 wait을 했지만
            // synchronized가 잡혀있는 상태가 아닌 lock이 해제되는 상태로 변한다. 대기 시간을 넣으면 notify를 하지 않아도 일정 시간
            // 후에 스레드는 깨어난다.
            super.wait(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    // 실행
    @Override
    public void run() {
        // 반복문
        for (int i = 0; i < 10; i++) {
            // print 함수 호출
            print();
        }
    }
    // 실행 함수
    public static void main(String[] args) {
        J25_3 a = new J25_3();
        // 두개의 스레드에 a 인스턴스를 실행한다.
        new Thread(a).start();
        new Thread(a).start();
    }
}
