public class J19_4 {
    // test1를 람다식으로 설정한 예제
    public static void test1(Runnable test) {
        // 함수 실행
        test.run();
    }
    // 실행 함수
    public static void main(String ...args) {
        final int data = 10;
        // test1 함수에 람다식을 넣어서 실행
        test1(() -> {
            // 클로저 기능으로 data의 값을 가져와 사용할 수 있다.
            System
                .out
                .println("run! data - " + data);
        });
    }

}
