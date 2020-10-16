public class J10_4 {
    // 변수
    private int data;
    // 생성자
    public J10_4(int data) {
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
    // 클래스를 초기화하는 함수
    public static void initClass(J10_4 ex) {
        // 값을 초기화
        ex.setData(0);
    }
    // 실행 함수
    public static void main(String ...args) {
        // J10_4 클래스 선언
        J10_4 ex1 = new J10_4(10);
        // ex1의 값을 초기화
        initClass(ex1);
        // ex1의 값을 출력
        ex1.print();
    }

}
