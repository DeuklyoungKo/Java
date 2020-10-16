public class J04_8 {
    // 실행 함수
    public static void main(String[] args) {
        // 변수 선언
        int i = 0;
        // 조건식에 true값이 들어가면 영원한 루프인 무한 루프에 빠집니다. 반목문 앞에 라벨을 지정할 수 있습니다. 라벨 test1
        test1 : while (true) {
            // 중첩 반목문. 라벨 test2
            test2 : for (int j = 0; j < 10; j++) {
                // i가 10부터 클 경우
                if (i > 10) {
                    // 콘솔 출력
                    System
                        .out
                        .println("break!!");
                    // while의 루프를 중단한다.
                    break test1;
                }
                // 콘솔 출력
                System
                    .out
                    .println("i = " + i);
                System
                    .out
                    .println("j = " + j);
                // j를 2로 나눈 나머지가 0, 즉 짝수 일 때 i를 1 증가
                if (j % 2 == 0) {
                    i++;
                }
            }
        }
    }

}
