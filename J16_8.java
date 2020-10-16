public class J16_8 {

    // 에러를 발생시키지만 컴파일하는 데 전혀 문제가 없다.
    public static void test() {
        throw new RuntimeException();
    }

    // 실행 함수
    public static void main(String ...args) {
        // test(); Exception의 예외 처리를 했다.
        try {
            test();
        } catch (Exception e) {
            // 에러 내용 콘솔 출력 printStackTrace 함수를 사용하면 call stack까지 전부 표시해 준다.(가장 자주 사용하는 에러 표시
            // 방법이다.)
            e.printStackTrace();
        }

    }

}