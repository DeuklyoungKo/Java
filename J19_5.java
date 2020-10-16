// 인터페이스
interface LambdaExpression<T, V, S> {
    // 파라미터는 모두 제네릭 타입이다.
    S run(T param1, V param2);
}

public class J19_5 {
    // 두번째, 세번째 입력되는 데이터 타입으로 제네릭이 자동으로 결정된다.
    public static <T, V, S> S test1(
        LambdaExpression<T, V, S> test,
        T param1,
        V param2
    ) {
        // LambdaExpression 인터페이스의 run 함수에 첫번째, 두번째 파라미터 넣는다.
        return test.run(param1, param2);
    }
    // 실행 함수
    public static void main(String ...args) {
        // 두번째, 세번째 파라미터는 10과 20으로 V와 S는 int형으로 자동 설정
        int ret = test1((p1, p2) -> {
            // return 값은 int 형 + int 형 이기 때문에 자동으로 int형
            return p1 + p2;
        }, 10, 20);
        // 콘솔 출력
        System
            .out
            .println("Result - " + ret);
    }

}
