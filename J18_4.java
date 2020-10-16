// 인터페이스
interface Testable4 {
    // 함수로 추상화
    void run();
}

// 위 인터페이스를 상속
class Test111 implements Testable4 {
    // 멤버 변수
    private int index;
    // 클로저와 같은 기능으로 index를 받는다.
    public Test111(int index) {
        this.index = index;
    }
    // run 함수 재정의
    @Override
    public void run() {
        // 콘솔 출력
        System.out.println("run call! index - " + index);
    }
}

public class J18_4 {
    // 인터페이스 Testable로 된 클래스를 실행하는 함수
    public static void test(Testable4 param) {
        // run 실행
        param.run();
    }
    // 실행 함수
    public static void main(String ...args) {

        for (int i = 0; i < 100; i++) {
            Testable4 case1 = new Test111(i);
            // test 함수 실행
            test(case1);
        }
    }

}
