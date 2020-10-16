// 인터페이스
interface Testable5 {
    // 함수로 추상화
    void run();
}
// 카운팅 클래스
class Node {
    // counting 함수를 호출한 횟수
    private int count = 0;
    // count 값을 리턴, 리턴하면 값을 1 증가한다.
    public int counting() {
        return this.count++;
    }
}

public class J18_5 {
    // 인터페이스 Testable5로 된 클래스를 실행하는 함수
    public static void test(Testable5 param) {
        // run 실행
        param.run();
        // execute 실행
    }
    // 실행 함수
    public static void main(String ...args) {
        // 상수화. 클로저를 사용하기 위해서는 값을 상수화되어야 한다. 클로저 값을 사용하는 익명 클래스에서 이 값을 변경하지 못하게 하기
        // 위해서이다.
        final Node node = new Node();
        for (int i = 0; i < 100; i++) {
            // Test1 인스턴스를 생성
            Testable5 case1 = new Testable5() {
                // run 함수 실행
                @Override
                public void run() {
                    // index는 이 인스턴스 밖에서 선언된 변수
                    System
                        .out
                        .println("run call! index - " + node.counting());
                }
            };
            // test 함수 실행
            test(case1);
        }
    }

}
