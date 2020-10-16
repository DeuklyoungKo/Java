import java.util.concurrent.Callable;

public class J19_3 {
    // Runnable를 파라미터로 한 함수
    public static void test1(Runnable test) {
        // 함수 실행
        test.run();
    }
    // Callable를 파라미터로 한 함수
    public static <V> V test2(Callable<V> test) {
        // Callable은 throws로 Exception이 설정되어 있음.
        try {
            // Callable에서 설정된 제네릭 값이 반환 타입이다.
            return test.call();
        } catch (Throwable e) {
            return null;
        }
    }
    // 실행 함수
    public static void main(String ...args) {
        // test1를 람다식으로 설정한 예제
        test1(() -> {
            // 콘솔 출력
            System.out.println("run!");
        });
        // test2를 람다식으로 설정한 예제 Callable의 제네릭은 람다식의 return 데이터 타입에 의해 자동 설정
        int data = test2(() -> {
            // int형이기 때문에 test2의 반환 값을 int형으로 자동 설정된다.
            return 10;
        });
        // 콘솔 출력
        System.out.println("data - " + data);
    }

}
