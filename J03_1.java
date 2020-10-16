public class J03_1 {
    // 실행 함수
    public static void main(String[] args) {
        // 변수 선언
        int a = 1;
        int b = 2;
        int c;
        // ++가 a의 뒤에 있으므로 후위 계산 즉 b + a의 계산 1+2가 c에 3으로 입력이 되고 마지막에 a를 1증가한다.
        c = b + a++;
        // 콘솔 출력
        System
            .out
            .println("a = " + a + " b = " + b + " c = " + c);
        // 변수 재선언
        a = 1;
        b = 2;
        // ++가 a의 앞에 있으므로 전위 계산 즉 b + a의 계산 전에 a를 증가 시키고 a가 2가 된 상태의 2+2를 계산해서 c에는 4로
        // 입력한다.
        c = b + ++a;
        System
            .out
            .println("a = " + a + " b = " + b + " c = " + c);
    }

}
