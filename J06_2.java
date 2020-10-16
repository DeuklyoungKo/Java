public class J06_2 {
    // 실행 함수
    public static void main(String ...args) {
        // 물건이 a, b, c, d가 있다. a의 가격은 1000원
        int a = 1000;
        // b의 가격은 2000원
        int b = 2000;
        // c의 가격은 1500원
        int c = 1500;
        // d의 가격은 1300원
        int d = 1300;
        // 결과 변수
        int ret = 0;
        // a, c, d를 구매 했을 때, 세금 포함한 가격을 계산.
        ret = cal(a, c, d);
        // 콘솔 출력
        System
            .out
            .println("a + c + d = " + ret);
        // a, c를 구매 했을 때, 세금 포함한 가격을 계산.
        ret = cal(a, c);
        // 콘솔 출력
        System
            .out
            .println("a + c = " + ret);
        // b, c, d를 구매 했을 때, 세금 포함한 가격을 계산.
        ret = cal(b, c, d);
        // 콘솔 출력
        System
            .out
            .println("b + c + d = " + ret);
    }
    // 가변 파라미터는 ...으로 표시한다. 가변 파라미터는 파라미터의 개수가 정해지지 않은 것이다. 함수를 호출하는 곳에서는 int형 파라미터를
    // 1개를 넣어도 되고 2개를 넣어도 된다. 함수 내부에서는 배열로 취급한다. 함수는 int형으로 물건의 가격을 모두 더한 뒤 10퍼센트의
    // 세금을 붙여서 총 가격(세금 포함)을 계산하는 함수이다.
    public static int cal(int ...data) {
        // 총액의 변수
        int sum = 0;
        // 입력된 파라미터를 모두 더한다.
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        // 세금은 총 금액의 10퍼센트
        int tax = sum / 10;
        // 총액 + 세금
        return sum + tax;
    }

}
