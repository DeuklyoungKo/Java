public class J10_2 {
    // 변수
    private int data;
    // 생성자
    public J10_2(int data) {
        setData(data);
    }
    // 변수 설정
    public void setData(int data) {
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
        // Example 클래스 선언
        J10_2 ex1 = new J10_2(10);
        // ex1 변수를 ex2로 넣는다.
        J10_2 ex2 = ex1;
        // hashcode 출력
        System
            .out
            .println("ex1 hashcode = " + ex1.hashCode());
        System
            .out
            .println("ex2 hashcode = " + ex2.hashCode());
        // ex2의 클래스의 data를 수정하면
        ex2.setData(20);
        // ex1의 data 콘솔 출력
        System
            .out
            .println("ex1 data");
        ex1.print();
        // ex2의 data 콘솔 출력
        System
            .out
            .println("ex2 data");
        ex2.print();
    }

}
