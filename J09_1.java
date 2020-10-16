public class J09_1 {
    // private로 설정된 함수
    private void func() {
        // 콘솔 출력
        System
            .out
            .println("func");
    }
    // public로 설정된 함수
    public void print() {
        // func함수 호출
        this.func();
        // 콘솔 출력
        System
            .out
            .println("hello world");
    }
    // main 함수
    public static void main(String ...args) {
        // Program 클래스 생성
        J09_1 p = new J09_1();
        // Program 클래스의 print함수 호출
        p.print();
    }

}
