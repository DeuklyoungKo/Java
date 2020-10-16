public class J11_4 {
    // 변수
    private int data;
    // 생성자
    public J11_4(int data) {
        // 변수 값 설정
        this.data = data;
    }
    // 출력 함수
    public J11_4 print() {
        // 콘솔 출력
        System
            .out
            .println("data - " + this.data);
        // 자기 자신 클래스를 리턴
        return this;
    }
    // Object 클래스에서 재정의했다.
    @Override public boolean equals(Object val) {
        // 비교하는 클래스가 J11_4 클래스가 아니면 false
        if (val.getClass() != J11_4.class) {
            return false;
        }
        // J11_4 클래스이고
        J11_4 d = (J11_4)val;
        // 값이 같으면 true, 다르면 false
        return d.data == this.data;
    }
    // 실행 함수
    public static void main(String ...args) {
        // J11_4 클래스 선언
        J11_4 ex1 = new J11_4(1);
        J11_4 ex2 = new J11_4(1);
        // 콘솔 출력
        System
            .out
            .println("ex1 hashCode - " + ex1.hashCode());
        System
            .out
            .println("ex2 hashCode - " + ex2.hashCode());
        // ==를 통해 비교하는 경우
        System
            .out
            .println("ex1 == ex2 - " + (
                ex1 == ex2
            ));
        // equals 함수를 비교하는 경우.
        System
            .out
            .println("ex1 equals ex2 - " + (
                ex1.equals(ex2)
            ));

        System.out.println("ex1.getClass - " + ex1.getClass());
        System.out.println("ex2.getClass - " + ex2.getClass());

    }

}
