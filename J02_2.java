// BigDecimal형을 사용하기 위해서 클래스를 선언해야 한다.
import java.math.BigDecimal;
public class J02_2 {
    // 실행 함수
    public static void main(String[] args) {
        // 정수형 Integer, 변수명 a
        Integer a;
        // 실수형 Float, 변수명 b
        Float b;
        // 문자형 Character, 변수명 c
        Character c;
        // 부울형 Boolean, 변수명 d
        Boolean d;
        // 문자열형 Boolean, 변수명 e
        String e;
        // 문자실수형 BigDecimal, 변수명 f
        BigDecimal f;
        // 값을 넣을 때는 이꼴을 사용한다. a는 정수형이기 때문에 정수 값을 넣는다.
        a = 1;
        // b는 실수형이기 때문에 실수 값을 넣는다. (여기서 float형은 f를 double형은 d를 숫자뒤에 넣는다.)
        b = 2.1f;
        // c는 문자형이기 때문에 문자 한 글자를 넣는다. (여기서 문자는 작은 따온표, 문자열은 큰따옴표로 구분. 문자열은 char 타입에 들어가지
        // 않는다.)
        c = 'a';
        // d는 부울형이기 때문에 true, false로 값을 넣는다.
        d = true;
        // e는 문자열형이기 때문에 문자열을 넣는다.
        e = "Hello world";
        // BigDecimal은 자동 operation 변환 식이 없다. 그래서 new를 사용해야 한다. 문자 실수형. 정수나 실수형으로도 대입
        // 가능하다. 그러나 오차를 줄이기 위해서 문자열이 좋다.
        f = new BigDecimal("3.1");
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
        System
            .out
            .println("e = " + e);
        System
            .out
            .println("f = " + f);
    }
}