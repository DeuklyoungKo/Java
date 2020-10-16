public class J02_1 {
    // 실행 함수
    public static void main(String[] args) {
        // 정수형 int, 변수명 a
        int a;
        // 실수형 float, 변수명 b
        float b;
        // 문자형 char, 변수명 c
        char c;
        // 부울형 boolean, 변수명 d
        boolean d;
        // 값을 넣을 때는 이꼴을 사용한다. a는 정수형이기 때문에 정수 값을 넣는다.
        a = 1;
        // b는 실수형이기 때문에 실수 값을 넣는다. (여기서 float형은 f를 double형은 d를 숫자뒤에 넣는다.)
        b = 2.1f;
        // c는 문자형이기 때문에 문자 한 글자를 넣는다. (여기서 문자는 작은 따온표, 문자열은 큰따옴표로 구분. 문자열은 char 타입에 들어가지
        // 않는다.)
        c = 'a';
        // d는 부울형이기 때문에 true, false로 값을 넣는다.
        d = true;
        // 콘솔 출력
        System
            .out
            .println("a = " + a);
        System
            .out
            .println("b = " + b);
        System
            .out
            .println("c = " + c);
        System
            .out
            .println("d = " + d);
    }
}