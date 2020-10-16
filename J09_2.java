// 상위 클래스 (SuperProgram)
class SuperProgram1 {
    // protected로 설정된 함수
    protected void print() {
        // 콘솔 출력
        System
            .out
            .println("SuperProgram print");
    }
}

public class J09_2 extends SuperProgram1 {
    // private로 설정된 함수
    protected void print() {
        // 콘솔 출력
        System
            .out
            .println("Program print");
    }
    // public으로 설정된 함수
    public void run() {
        // 상위 클래스의 print 호출
        super.print();
        // 내부 클래스의 print 호출
        this.print();
    }
    // main 함수
    public static void main(String ...args) {
        // Program 클래스 생성
        J09_2 p = new J09_2();
        // run 함수 호출
        p.run();
    }

}
