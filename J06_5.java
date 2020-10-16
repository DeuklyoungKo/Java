public class J06_5 {
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
        // 결과 변수
        int sum = 0;
        for (int i = param; i > 0; i--) {
            // 모두 더한다.
            sum += i;
            // 콘솔 출력
            System
                .out
                .print(i);
            if (i != 1) {
                // 콘솔 출력
                System
                    .out
                    .print(" + ");
            }
        }
        // 결과 리턴
        return sum;
    }

}
