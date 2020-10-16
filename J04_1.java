public class J04_1 {
    // 실행 함수
    public static void main(String[] args) {
        // 부울 값 설정 = true
        boolean a = true;
        // 변수 a가 true면
        if (a) {
            // 콘솔 출력
            System
                .out
                .println("first condition = true");
        }
        // 부울 값 설정 = false
        a = false;
        // 변수 a가 true면
        if (a) {
            // 콘솔 출력
            System
                .out
                .println("second condition = true");
            // 변수 b가 false이면
        } else {
            // 콘솔 출력
            System
                .out
                .println("second condition = false");
        }
        // 변수 b에 값 2를 설정
        int b = 2;
        // 변수 b가 1이면
        if (b == 1) {
            // 콘솔 출력
            System
                .out
                .println("third condition b = 1");
            // 변수 b가 2이면
        } else if (b == 2) {
            // 콘솔 출력
            System
                .out
                .println("third condition b = 2");
            // 변수 b가 1또는 2가 아니면
        } else {
            // 콘솔 출력
            System
                .out
                .println("third condition = false");
        }
    }

}
