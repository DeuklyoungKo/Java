import java.io.Closeable;
// Closeable 인터페이스 상속

public class J26_4 implements Closeable {
    // 재정의 함수
    @Override
    public void close() {
        // 콘솔 촐력
        System
            .out
            .println("call close");
    }
    // 실행 함수
    public static void main(String[] args) {
        // 예외 처리 try에 if의 조건절 처럼 Closable를 상속받은 클래스를 넣으면 try의 스택영역이 끝날 때 자동으로 close를
        // 호출한다.
        try(J26_4 e = new J26_4()) {
            // 콘솔 출력
            System
                .out
                .println("hello world");
        }
    }

}
