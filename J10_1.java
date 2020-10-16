public class J10_1 {
    // 맴버 변수
    private int data;
    // 생성자
    public J10_1(int data) {
        // 데이터
        this.data = data;
    }
    // 출력 함수
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("data - " + this.data);
    }
    // 실행 함수
    public static void main(String ...args) {
        // 클래스 선언
        J10_1 ex = new J10_1(10);
        // 출력
        ex.print();
    }

}
