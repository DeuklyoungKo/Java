public class J11_1 {
    // 변수
    private int data;
    // 생성자
    public J11_1(int data) {
        // 변수 값 설정
        this.data = data;
    }
    // 출력 함수
    public J11_1 print() {
        // 콘솔 출력
        System
            .out
            .println("data - " + this.data);
        // 자기 자신 클래스를 리턴
        return this;
    }
    // 실행 함수
    public static void main(String ...args) {
        // J11_1 클래스 선언
        J11_1 ex1 = new J11_1(1);
        J11_1 ex2 = new J11_1(1);
        // 콘솔 출력
        System
            .out
            .println("ex1 hashCode - " + ex1.hashCode());
        System
            .out
            .println("ex2 hashCode - " + ex2.hashCode());
    }

}
