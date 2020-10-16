public class J36_3 implements Runnable {
    // 실행 함수
    public static void main(String ...args) {
        // 인스턴스 생성
        J36_3 test = new J36_3();
        // run 함수 호출
        test.run();
    }
    // Runnable 인터페이스의 run함수 재정의
    @Override
    public void run() {
        // 변수 선언
        int sum = 0;
        // sumFirstLoop 함수 호출
        sum = sumFirstLoop(sum);
        // 콘솔 출력
        System
            .out
            .println(sum);
    }
    // 첫 번째 루프
    private int sumFirstLoop(int sum) {
        // 반복문
        for (int i = 0; i < 1000; i++) {
            // 짝수가 아니면 continue
            if (i % 2 != 0) {
                continue;
            }
            // sumSecondLoop 함수 호출
            sum = sumSecondLoop(i, sum);
        }
        // 리턴
        return sum;
    }
    // 두번째 루프
    private int sumSecondLoop(int i, int sum) {
        // 반복문
        for (int j = i; j < 1000; j++) {
            // 3의 배수가 아니면 continue
            if (j % 3 != 0) {
                continue;
            }
            // 합을 더하기
            sum += i + j;
            // ...
        }
        // 리턴
        return sum;
    }

}
