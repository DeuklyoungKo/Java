public class J16_3 {
    // 함수
    public void run() {
        // 콘솔 출력
        System.out.println("run!!");
    }
    // 실행 함수
    public static void main(String ...args) {
        try {
            // 클래스 ex를 선언하고, 인스턴스 생성은 하지 않았다.
            J16_3 ex = null;
            // Example 클래스의 run 함수 호출
            ex.run();
            // 콘솔 출력
            System.out.println("not error");
            // NullPointerException만 잡는다.
        } catch (NullPointerException e) {
            // 에러 콘솔 출력
            System.out.println("null exception");
            // 모든 에러를 잡는다.
        } catch (Throwable e) {
            // 에러 콘솔 출력
            System.out.println(e);
        }
        // 콘솔 출력
        System.out.println("hello world");
    }

}
