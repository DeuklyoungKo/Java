// 인터페이스
interface Testable {
    // 두개의 함수로 구성
    void run();
    void execute();
}
// 위 인터페이스를 상속
class Test1 implements Testable {
    // run 함수 재정의
    @Override
    public void run() {
        // 콘솔 출력
        System.out.println( "Test - run!");
    }
    // execute 함수 재정의
    @Override
    public void execute() {
        // 콘솔 출력
        System.out.println( "Test - execute!");
    }
}

public class J18_1 {
    // 인터페이스 Testable로 된 클래스를 실행하는 함수
    public static void test(Testable param) {
        // run 실행
        param.run();
        // execute 실행
        param.execute();
    }
    // 실행 함수
    public static void main(String... args) {
        // Test1 인스턴스를 생성
        Testable case1 = new Test1();
        // test 함수 실행
        test(case1);
    }

}
