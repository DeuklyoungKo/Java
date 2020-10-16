public class J06_4 {
    // 실행 함수
    public static void main(String ...args) {
        // 콘솔 출력
        System
            .out
            .println("factorial - 10! ");
        // 팩토리얼 factorial(10)의 계산
        int ret = factorial(10);
        // 콘솔 출력
        System
            .out
            .print(" = " + ret);
        System
            .out
            .println();
    }
    // 팩토리얼 함수
    public static int factorial(int param) {
        // 팩토리얼은 1보다 아래의 수라면 에러가 발생한다.
        if (param < 1) {
            return -1;
        }
        // 1! = 1이다.
        if (param == 1) {
            // 콘솔 출력
            System
                .out
                .print(param);
            // 1을 반환
            return 1;
        }
        // 콘솔 출력
        System
            .out
            .print(param + " + ");
        // f(x) = f(x-1) + x가 팩토리얼 수학적 함수식, 을 고대로 프로그램에 가져왔다.
        return factorial(param - 1) + param;
    }

}
