public class J16_2 {
    // 함수
    public void run() {
        // 콘솔 출력
        System
            .out
            .println("run!!");
    }
    // 실행 함수
    public static void main(String ...args) {
        // 예외 처리 try 스택 영역에서 에러가 발생하면 catch로 점프합니다.
        try {
            // 클래스 ex를 선언하고, 인스턴스 생성은 하지 않았다.
            J16_2 ex = null;
            // Example 클래스의 run 함수 호출
            ex.run();
            // 콘솔 출력
            System
                .out
                .println("not error");
        } catch (Throwable e) {
            // 콘솔 에러 출력 출력
            System
                .out
                .println(e);
        }
        // 콘솔 출력
        System
            .out
            .println("hello world");
    }

}
