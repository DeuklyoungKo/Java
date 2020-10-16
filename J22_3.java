public class J22_3 {
    // 실행 함수
    public static void main(String[] args) {
        try {
            // i는 2부터 9까지 반복
            for (int i = 2; i < 10; i++) {
                // 배수 설정 (클로져)
                final int multiple = i;
                new Thread(() -> {
                    // 합산 변수
                    int sum = 0;
                    // 0부터 99까지
                    for (int j = 0; j < 100; j++) {
                        // 배수일 경우
                        if (j % multiple == 0) {
                            // 합산 변수에 값을 더한다.
                            sum += j;
                        }
                    }
                    // 결과 출력
                    System.out.println(multiple + " mutiple = " + sum);
                }).start();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
