public class J04_7 {
    // 실행 함수
    public static void main(String[] args) {
        // 변수 선언
        int i = 0;
        // 조건식에 true값이 들어가면 영원한 루프인 무한 루프에 빠집니다.
        while (true) {
            // i가 10부터 클 경우
            if (i > 10) {
                // 콘솔 출력
                System
                    .out
                    .println("break!!");
                // while의 루프를 중단한다.
                break;
            }
            // 콘솔 출력
            System
                .out
                .println("i = " + i);
            // i를 1 증가
            i++;
        }
    }

}