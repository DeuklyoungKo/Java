public class J06_1 {
    // 실행 함수
    public static void main(String ...args) {
        // 파라미터에 사용될 두 변수
        int a = 50;
        int b = 10;
        // 더하기 함수에 두 변수를 넣었다. add(50, 10) = 60
        int c = add(a, b);
        // 콘솔 출력
        System
            .out
            .println("50 + 10 = " + c);
        // 빼기 함수에 두 변수를 넣었다. sub(50, 10) = 40
        int d = sub(a, b);
        // 콘솔 출력
        System
            .out
            .println("50 - 10 = " + d);
        // 곱하기 함수에 두 변수를 넣었다. multi(50, 10) = 500
        int e = multi(a, b);
        // 콘솔 출력
        System
            .out
            .println("50 * 10 = " + e);
        // 나누기 함수에 두 변수를 넣었다. divi(50, 10) = 5
        int f = divi(a, b);
        // 콘솔 출력
        System
            .out
            .println("50 / 10 = " + f);
    }
    // main에서 호출할 수 있는 함수는 static이 붙어 있는 함수 뿐이다. 반환형은 int, 함수 이름은 add, 파라미터는 int형
    // 타입의 두개 더하기 함수
    public static int add(int a, int b) {
        // 두 개의 파라미터의 값을 더하고 반환한다.
        return a + b;
    }
    // 반환형은 int, 함수 이름은 add, 파라미터는 int형 타입의 두개 빼기 함수
    public static int sub(int a, int b) {
        // 두 개의 파라미터의 값을 빼고 반환한다.
        return a - b;
    }
    // 반환형은 int, 함수 이름은 add, 파라미터는 int형 타입의 두개 곱하기 함수
    public static int multi(int a, int b) {
        // 두 개의 파라미터의 값을 곱하고 반환한다.
        return a * b;
    }
    // 반환형은 int, 함수 이름은 add, 파라미터는 int형 타입의 두개 나누기 함수
    public static int divi(int a, int b) {
        // 두 개의 파라미터의 값을 나누고 반환한다.
        return a / b;
    }

}
