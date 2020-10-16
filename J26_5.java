import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class J26_5 {
    // 실행 함수
    public static void main(String[] args) {
        // 파일로 저장할 test 변수 선언
        String test = "hello world1\r\n";
        // String 타입을 byte 형식으로 변환
        byte[] binary = test.getBytes();
        // 파일 인스턴스 생성
        File file = new File("D:\\Lecture\\Java\\명월 일지\\test.txt");

        // Stream 인스턴스 생성 예외 처리 try에 if의 조건절 처럼 Closable를 상속받은 클래스를 넣으면 try의 스택영역이 끝날 때
        // 자동으로 close를 호출한다.
        try(OutputStream stream = new FileOutputStream(file)) {
            stream.write(binary);
            // 기본적으로 Stream 클래스는 throws IOException이 있기 때문에 catch도 같이 붙어간다.
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
