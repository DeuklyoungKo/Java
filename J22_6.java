import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J22_6 {
    // 실행 함수
    public static void main(String[] args) {
        try {
            // 날짜 포멧
            DateFormat format = new SimpleDateFormat("hh:MM:ss");
            Thread th = new Thread(() -> {
                try {
                    // 0부터 99까지 반복문
                    for (int i = 0; i < 100; i++) {
                        // 현재 시간 콘솔 출력
                        System.out.println(format.format(new Date()));
                        // 쓰레드를 1초 동안 정지
                        Thread.sleep(1000);
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            });
            // 스레드 실행
            th.start();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
