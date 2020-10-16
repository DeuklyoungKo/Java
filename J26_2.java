import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J26_2 {
    // 날짜 포멧
    private static DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    public static void main(String[] args) {
        try {
            // 파일 인스턴스 생성
            File file = new File("D:\\Lecture\\Java\\명월 일지\\test.txt");
            // 파일이 마지막으로 작성된 날짜 출력
            System
                .out
                .println("LastModified - " + format.format(new Date(file.lastModified())));
            // Calendar 인스턴스 가져오기
            Calendar c = Calendar.getInstance();
            // 2000년 1월 1일 12시로 설정
            c.set(2000, 01, 01, 12, 00);
            // 파일의 작성 시간 변경
            Files.setAttribute(
                Paths.get(file.getAbsolutePath()),
                "basic:creationTime",
                FileTime.fromMillis(c.getTimeInMillis()),
                java.nio.file.LinkOption.NOFOLLOW_LINKS
            );
            // 파일의 마지막 작성 시간 변경
            file.setLastModified(c.getTimeInMillis());
            // 파일의 마지막 접근 시간 변경
            Files.setAttribute(
                Paths.get(file.getAbsolutePath()),
                "basic:lastAccessTime",
                FileTime.fromMillis(c.getTimeInMillis()),
                java.nio.file.LinkOption.NOFOLLOW_LINKS
            );
            // 파일 크기로 binary를 선언
            byte[] binary = new byte[(int)file.length()];
            // Stream 인스턴스 생성
            InputStream stream = new FileInputStream(file);
            // 파일을 읽어오기
            stream.read(binary);
            // Stream 리소스 닫기
            stream.close();
            // 바이너리를 String으로 변환하고 콘솔 출력
            System
                .out
                .println(new String(binary));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
