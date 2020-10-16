public class J04_6 {
    // 실행 함수
    public static void main(String[] args) {
        // 초기 변수값
        int i = 0;
        do {
            // 콘솔 출력
            System
                .out
                .println("i = " + i);
            // i변수 값 증가
            i++;
            // i<10가 참이면 스택 영역 실행
        } while (i < 10);
        // 변수 재설정
        i = 1000;
        do {
            // 콘솔 출력
            System
                .out
                .println("i = " + i);
            // i변수 값 증가
            i++;
            // i<10가 참이면 스택 영역 실행
        } while (i < 10);
        // do ~ while은 반드시 한번은 실행하기 떄문에 조건식이 처음부터 틀리더라도 실행된다.
    }

}
