public class J36_4 implements Runnable {
    // 실행 함수
    public static void main(String ...args) {
        // 인스턴스 생성
        J36_4 test = new J36_4();
        // run 함수 호출
        test.run();
    }
    // 맴버 변수
    private int sum = 0;
    // Runnable 인터페이스의 run함수 재정의 메인 메소드에서는 맴버변수를 사용
    @Override
    public void run() {
        // sumFirstLoop 함수 실행
        sum = sumFirstLoop(sum);
        // 콘솔 출력
        System
            .out
            .println(sum);
    }
    // 첫 번째 루프 계산형 함수는 맴버를 직접 참조 하지 않고 파라미터로 데이터를 전달 받는다.
    private int sumFirstLoop(int sum) {
        // 반복문
        for (int i = 0; i < 1000; i++) {
            // 짝수가 아니면 continue
            if (i % 2 != 0) {
                continue;
            }
            // sumSecondLoop 함수 호출
            sum = sumSecondLoop(i, sum);
            // ...
        }
        return sum;
    }
    // 두번째 루프 계산형 함수는 맴버를 직접 참조 하지 않고 파라미터로 데이터를 전달 받는다.
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
        return sum;
    }

}
