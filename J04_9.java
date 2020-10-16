public class J04_9 {
    // 실행 함수
    public static void main(String[] args) {
        // 0부터 9까지 반복문을 실행한다.
        for (int i = 0; i < 10; i++) {
            // i의 값을 2로 나눈 나머지가 0, 즉 짝수의 경우
            if (i % 2 == 0) {
                // 아래의 콘솔 출력을 실행하지 않고 다음 증감식으로 이동한다.
                continue;
            }
            // 콘솔 출력
            System
                .out
                .println("i = " + i);
        }
    }

}
