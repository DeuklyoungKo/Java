public class J04_2 {
    // 실행 함수
    public static void main(String[] args) {
        // 변수 data에 10을 설정
        int data = 10;
        // data의 조건 변수
        switch (data) {
                // data가 10인 경우
            case 10:
                // 콘솔 출력
                System
                    .out
                    .println("data = 10");
                // switch 빠져나오기
                break;
                // data가 20인 경우
            case 20:
                // 콘솔 출력
                System
                    .out
                    .println("data = 20");
                // switch 빠져나오기
                break;
                // case에서 선택되지 않았을 경우
            default:
                // 콘솔 출력
                System
                    .out
                    .println("default");
                // switch 빠져나오기
                break;
        }
        // 합산 변수 설정
        int sum = 0;
        // data의 조건 변수
        switch (data) {
                // data가 10인 경우
            case 10:
                // 합산 변수에 10을 더한다.
                sum += 10;
                // break가 없기 때문에 10을 선택하면 case 9도 처리된다. data가 9인 경우
            case 9:
                // 합산 변수에 9을 더한다.
                sum += 9;
                // break가 없기 때문에 처리가 계속 내려간다. data가 8인 경우
            case 8:
                // 합산 변수에 8을 더한다.
                sum += 8;
                // break가 없기 때문에 처리가 계속 내려간다. data가 7인 경우
            case 7:
                // 합산 변수에 7을 더한다.
                sum += 7;
                // break가 없기 때문에 처리가 계속 내려간다. data가 6인 경우
            case 6:
                // 합산 변수에 6을 더한다.
                sum += 6;
                // break가 없기 때문에 처리가 계속 내려간다. data가 5인 경우
            case 5:
                // 합산 변수에 5을 더한다.
                sum += 5;
                // break가 없기 때문에 처리가 계속 내려간다. data가 4인 경우
            case 4:
                // 합산 변수에 4을 더한다.
                sum += 4;
                // break가 없기 때문에 처리가 계속 내려간다. data가 3인 경우
            case 3:
                // 합산 변수에 3을 더한다.
                sum += 3;
                // break가 없기 때문에 처리가 계속 내려간다. data가 2인 경우
            case 2:
                // 합산 변수에 2을 더한다.
                sum += 2;
                // break가 없기 때문에 처리가 계속 내려간다. data가 1인 경우
            case 1:
                // 합산 변수에 1을 더한다.
                sum += 1;
        }
        // 콘솔 출력
        System
            .out
            .println("sum = " + sum);
    }

}
