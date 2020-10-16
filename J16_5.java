public class J16_5 {
    // 멤버 변수
    private int data;
    // 생성자
    public J16_5(int data) {
        // 멤버 변수 설정
        this.data = data;
    }
    // 계산 함수
    public int calc() {
        try {
            // 100에서 data의 값으로 나눈다.
            return 100 / this.data;
        } catch (ArithmeticException e) {
            // 에러가 발생하면 0을 리턴
            return 0;
        }
    }
    // 실행 함수
    public static void main(String ...args) {
        // 인스턴스 생성
        J16_5 ex = new J16_5(0);
        // 결과 콘솔 출력
        System
            .out
            .println("result - " + ex.calc());
        // 결과 콘솔 출력
        System
            .out
            .println("result - " + ex.calc());
    }

}
