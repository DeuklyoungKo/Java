// 인터페이스
interface Testable19_2 {
    void run();
}

public class J19_2 {
    // 인터페이스 Testable로 된 클래스를 실행하는 함수
    public static void test(Testable19_2 test) {
        // run 실행
        test.run();
    }
    // 실행 함수
    public static void main(String ...args) {
        // 람다식, 익명 클래스의 new의 선언도 없이 바로 run 함수를 실행할 수 있는 표현식
        Testable19_2 obj = () -> {
            // 콘솔 출력
            System.out.println("run!");
        };
        // test 함수 실행
        test(obj);
    }

}
