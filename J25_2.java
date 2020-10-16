import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J25_2 implements Runnable {
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
            // synchronized가 잡혀있는 상태가 아닌 lock이 해제되는 상태로 변한다.
            super.wait();
            // 콘솔 출력
            System
                .out
                .println(Thread.currentThread().getName() + " wait");
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
            // 동기화 영역
            synchronized(this) {
                // 콘솔 출력
                System
                    .out
                    .println(Thread.currentThread().getName() + " notify ");
                // notify를 호출한다.
                notify();
            }
            // print 함수 호출
            print();
        }
    }
    // 실행 함수
    public static void main(String[] args) {
        J25_2 a = new J25_2();
        // 두개의 스레드에 a 인스턴스를 실행한다.
        new Thread(a).start();
        new Thread(a).start();
        try {
            // 마지막은 wait으로 끝나기 때문에
            Thread.sleep(2000);
            synchronized(a) {
                // 모든 스레드를 깨워서 종료해야 한다.
                a.notifyAll();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
