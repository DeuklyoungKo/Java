public class J36_2 {
    // 실행 함수
    public static void main(String ...args) {
        int sum = 0;
        // 아래와 같이 작성하면 가독성이 떨어진다. 반복문
        for (int i = 0; i < 1000; i++) {
            // 짝수면...
            if (i % 2 == 0) {
                // 반복문
                for (int j = i; j < 1000; j++) {
                    // 3의 배수면
                    if (j % 3 == 0) {
                        // 더한다. 여기까지 4-depth
                        sum += i + j;
                        // .....
                    }
                }
                // .....
            }
        }
        // 콘솔 출력
        System
            .out
            .println(sum);
        sum = 0;
        // 아래와 같이 작성하면 depth(깊이)가 깊지 않기 때문에 보기가 조금 편합니다. 반복문
        for (int i = 0; i < 1000; i++) {
            // 홀수면 continue
            if (i % 2 != 0) {
                continue;
            }
            // 반복문
            for (int j = i; j < 1000; j++) {
                // 3의 배수가 아니면 continue
                if (j % 3 != 0) {
                    continue;
                }
                // 더한다. 여기까지 2-depth
                sum += i + j;
            }
            // ...
        }
        // 콘솔 출력
        System
            .out
            .println(sum);
    }

}
