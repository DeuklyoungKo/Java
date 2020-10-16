import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class J28_1 {
    // 실행 함수
    public static void main(String[] args) {
        try {
            // 파일로 저장할 test 변수 선언
            String test = "hello world2";
            // String 타입을 byte 형식으로 변환
            byte[] binary = test.getBytes();
            // 파일 인스턴스 생성
            File file = new File("D:\\Lecture\\Java\\명월 일지\\test.txt");
            // Stream 인스턴스 생성
            OutputStream stream = new FileOutputStream(file);
            // OutputStream에 test의 바이너리를 작성
            stream.write(binary);
            // Stream 리소스 닫기
            stream.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
