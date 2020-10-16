public class J10_6 {
    // 변수
    private int data;
    // 생성자
    public J10_6(int data) {
        // 변수 값 설정
        this.data = data;
    }
    // 더하기 함수
    public J10_6 sum(int data) {
        // 변수에 값을 가산
        this.data += data;
        // 콘솔 출력
        return print();
    }
    // 출력 함수
    public J10_6 print() {
        // 콘솔 출력
        System
            .out
            .println("data - " + this.data);
        // 자기 자신 클래스를 리턴
        return this;
    }
    // 실행 함수
    public static void main(String ...args) {
        // J10_6 클래스 선언
        J10_6 ex = new J10_6(1);
        // sum 함수에는 print를 호출하는데. print함수는 자기 자신의 참조 값을 리턴한다. 즉 ex.sum(2), ex.sum(3)과 같은
        // 효과의 chain 메소드 패턴이 구현된다.
        ex
            .sum(2)
            .sum(3)
            .sum(4)
            .sum(5)
            .sum(6)
            .sum(7)
            .sum(8)
            .sum(9)
            .sum(10);
        // 콘솔 출력
        System
            .out
            .println("ex data return");
        // 결과 출력
        ex.print();
    }

}
