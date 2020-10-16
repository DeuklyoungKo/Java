// TestException을 생성했다.
class TestException extends RuntimeException {
    // 사실 생성자나 함수 재정의를 통해서 에러 특성을 더 만들 수도 있다.
}

public class J16_7 {
    // 함수
    public static void test() {
        // throw를 통해 에러 발생
        // throw new TestException();
    }
    // 실행 함수
    public static void main(String ...args) {
        // test 함수 호출
        test();
    }
}