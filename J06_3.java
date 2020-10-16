public class J06_3 {
    // 실행 함수
    public static void main(String ...args) {
        // 함수 호출
        func(1);
        func(1, 2);
        func(1, 2, "test");
    }
    // 함수의 이름은 func, 파라미터는 int형 타입 한개
    public static void func(int p1) {
        // 콘솔 출력
        System
            .out
            .println("func parameter count - 1, param = " + p1);
    }
    // 함수의 이름은 func, 파라미터는 int형 타입 두개
    public static void func(int p1, int p2) {
        // 콘솔 출력
        System
            .out
            .println("func parameter count - 2, param = " + p1 + "," + p2);
    }
    // 함수의 이름은 func, 파라미터는 int형 타입 두개, String형 타입 한개
    public static void func(int p1, int p2, String p3) {
        // 콘솔 출력
        System
            .out
            .println("func parameter count - 3, param = " + p1 + "," + p2 + "," + p3);
    }

}
