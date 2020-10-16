// 인터페이스
interface Testable2 {
    // 두개의 함수로 구성
    void run();
    void execute();
}

public class J18_2 {
    // 인터페이스 Testable2로 된 클래스를 실행하는 함수
    public static void test(Testable2 param) {
        // run 실행
        param.run();
        // execute 실행
        param.execute();
    }
    // 실행 함수
    public static void main(String... args) {
        // 인터페이스로 인스턴스를 생성
        Testable2 case1 = new Testable2() {
            // run 함수를 재정의한다.
            @Override
            public void run() {
                // 콘솔 출력
                System.out.println( "run call!");
            }
            // execute 함수를 재정의한다.
            @Override
            public void execute() {
                // 콘솔 출력
                System.out.println( "execute call!");
            }
        };
        // test 함수 실행
        test(case1);
    }

}
