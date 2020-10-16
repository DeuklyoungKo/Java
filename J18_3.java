// 인터페이스
interface Testable3 {
    // 함수로 추상화
    void run();
}

public class J18_3 {
    // 인터페이스 Testable3로 된 클래스를 실행하는 함수
    public static void test(Testable3 param) {
        // run 실행
        param.run();
    }
    // 실행 함수
    public static void main(String ...args) {
        for (int i = 0; i < 100; i++) {
            // 상수화. 클로저를 사용하기 위해서는 값을 상수화되어야 한다. 클로저 값을 사용하는 익명 클래스에서 이 값을 변경하지 못하게 하기 위해서
            // 이다.
            final int index = i;
            // Test1 인스턴스를 생성
            Testable3 case1 = new Testable3() {
                // run 함수 실행
                @Override
                public void run() {
                    // index는 이 인스턴스 밖에서 선언된 변수
                    System
                        .out
                        .println("run call! index - " + index);
                }
            };
            // test 함수 실행
            test(case1);
        }
    }

}