public class J03_2 {
    // 실행 함수
    public static void main(String[] args) {
        // 변수 선언
        int a = 1;
        int b = 2;
        int c;
        // 가독성으로 후위와 계산식을 같이 넣지 말고 계산하고
        c = b + a;
        // a를 증가하는 식을 넣는 방식으로 가독성을 높힌다.
        a++;
        // 콘솔 출력
        System
            .out
            .println("a = " + a + " b = " + b + " c = " + c);
    }

}
