public class J11_6 {
    // 변수
    private int data;
    // 생성자
    public J11_6(int data) {
        // 변수 값 설정
        this.data = data;
    }
    // toString 함수 재정의
    // @Override
    public String toString() {
        // 콘솔 출력
        System.out.println( "data - " + data);
        // toString 결과 리턴
        return  "Hello world";
    }
    // 실행 함수
    public static void main(String... args) {
        // J11_6 클래스 선언
        J11_6 ex1 = new J11_6(1);
        // toString 결과 출력
        System.out.println( "ex1.toString - " + ex1.toString());
    }

}
