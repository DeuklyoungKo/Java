import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class J26_3 {
    // 실행 함수
    public static void main(String[] args) {
        try {
            // 파일로 저장할 test 변수 선언
            String test = "hello world\r\n";
            // String 타입을 byte 형식으로 변환
            byte[] binary = test.getBytes();
            // 파일 인스턴스 생성
            File file = new File("D:\\Lecture\\Java\\명월 일지\\test.txt");
            // Stream 인스턴스 생성
            OutputStream stream = new FileOutputStream(file);
            // OutputStream에 test의 바이너리를 작성
            stream.write(binary);
            // 시스템을 멈춘다.
            synchronized(stream) {
                stream.wait();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
