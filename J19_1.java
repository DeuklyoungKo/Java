// 인터페이스
interface Testable19_1 {
    void run();
}
// Testable19_1 인터페이스를 상속
class Test19_1 implements Testable19_1 {
    // 함수 재정의
    @Override
    public void run() {
        // 콘솔 출력
        System.out.println( "run!");
    }
}

public class J19_1 {
    // 인터페이스 Testable19_1로 된 클래스를 실행하는 함수
    public static void test(Testable19_1 test) {
        // run 실행
        test.run();
    }
    // 실행 함수
    public static void main(String... args) {
        // 인스턴스 생성
        Testable19_1 obj = new Test19_1();
        // test 함수 실행
        test(obj);
    }

}
