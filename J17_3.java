// 제네릭을 이용한 인터페이스
interface Callable<V> {
    V call();
}
// 인터페이스 상속, 제네릭 타입에 String을 선언
class Test implements Callable<String> {
    @Override
    public String call() {
        return  "Hello world";
    }
}

public class J17_3 {
    // 제네릭 함수, 제네릭 함수는 반환 타입 앞에 제네릭을 선언한다.
    public static <T> T test1(Callable<T> func) {
        // 인터 페이스의 call 함수 호출
        return func.call();
    }
    // 실행 함수
    public static void main(String... args) {
        //Test 클래스
        Test test = new Test();
        // Test클래스는 제네릭이 String 타입이니 String타입으로 결과가 나온다.
        String data = test1(test);
        // 콘솔 출력
        System.out.println( "Test - " + data);
    }

}
