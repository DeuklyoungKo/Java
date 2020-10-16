// 상위 클래스 (SuperProgram)
class SuperProgram {
    // 함수
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("SuperProgram print");
    }
}

public class J08_3 extends SuperProgram {
    // 함수
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("Program print");
    }
    // 함수
    public void run() {
        // 상위 클래스의 print 호출
        super.print();
        // 내부 클래스의 print 호출
        this.print();
    }
    // main 함수
    public static void main(String ...args) {
        // Program 클래스 생성
        J08_3 p = new J08_3();
        // run 함수 호출
        p.run();
    }

}
