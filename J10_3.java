public class J10_3 {
    // 변수
    private int data;
    // 생성자
    public J10_3(int data) {
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
    public static J10_3 initClass(J10_3 ex) {
        // 값을 초기화
        ex.setData(0);
        // 파라미터를 리턴
        return ex;
    }
    // 실행 함수
    public static void main(String ...args) {
        // Example 클래스 선언
        J10_3 ex1 = new J10_3(10);
        // ex2 변수에 ex1 클래스를 초기화해서 넣는다.
        J10_3 ex2 = initClass(ex1);
        // hashcode 출력
        System
            .out
            .println("ex1 hashcode = " + ex1.hashCode());
        System
            .out
            .println("ex2 hashcode = " + ex2.hashCode());
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
