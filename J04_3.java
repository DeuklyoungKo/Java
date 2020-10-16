public class J04_3 {
    // 실행 함수
    public static void main(String[] args) {
        // 초기값 i는 0을 설정한다. 조건식의 i<10의 조건이 true일 경우 아래의 콘솔 출력을 한다. 증감식은 아래의 스택 영역이 실행되고 난
        // 후에 i++를 실행한다.
        for (int i = 0; i < 10; i++) {
            // 콘솔 출력
            System
                .out
                .println("i = " + i);
        }
        int a = 0;
        // 조건식과 증감식에는 반드시 초기식을 사용할 필요는 없다. 하지만 가독성을 위해 초기식 사용을 권장한다.
        for (int i = 0; a < 3; a++) {
            // 콘솔 출력
            System
                .out
                .println("a = " + a);
        }
    }

}
