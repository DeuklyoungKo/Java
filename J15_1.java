// 사람 클래스
class People15_1 {
    // 상태
    private int state;
    // 일 추가
    public void addState(int state) {
        // 상태에 추가한다.
        this.state |= state;
    }
    // 출력
    public void print() {
        // 청소했는지 체크
        if ((this.state & 0x01) != 0) {
            // 콘솔 출력
            System
                .out
                .println("clean");
        }
        // 공부했는지 체크
        if ((this.state & 0x2) != 0) {
            // 콘솔 출력
            System
                .out
                .println("study");
        }
        // 놀았는지 체크
        if ((this.state & 0x4) != 0) {
            // 콘솔 출력
            System
                .out
                .println("play");
        }
        // 잤는지 체크
        if ((this.state & 0x8) != 0) {
            // 콘솔 출력
            System
                .out
                .println("sleep");
        }
    }
}

public class J15_1 {
    // 상수 선언 청소 0001
    public static final int clean = 0x1;
    // 공부 0010
    public static final int study = 0x2;
    // 놀기 0100
    public static final int play = 0x4;
    // 잠 1000
    public static final int sleep = 0x8;
    // 실행 함수
    public static void main(String ...args) {
        // 사람 인스턴스 생성
        People15_1 p1 = new People15_1();
        // 청소하고 놀았다.
        p1.addState(clean);
        p1.addState(study);
        // 출력
        p1.print();
    }

}
