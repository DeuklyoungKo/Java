import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// 클래스에서 사용하도록 설정
@Target(ElementType.TYPE)
//어노테이션 선언
@interface TestClassAnnotaion {
    // 어노테이션 속성 (value는 속성 설정을 생략 가능하다.)
    public String value();
}
// 메서드에서 사용하도록 설정
@Target(ElementType.METHOD)
// 어노테이션 선언
@interface TestMethodAnnotaion {
    // 어노테이션 속성
    public String name() default "no name";
}
// 변수에 사용하도록 설정
@Target(ElementType.FIELD)
//어노테이션 선언
@interface TestVariableAnnotaion {
    // 어노테이션 속성 default가 없으면 필수 속성이 된다.
    public String name();
}

public class J21_2 {

    // 클래스 어노테이션 설정
    @TestClassAnnotaion("test")
    class Node {
        // 메서드 어노테이션
        @TestMethodAnnotaion(name = "print")
        public void print() {
            // 콘솔 출력
            System.out.println("Hello world");
        }
    }

    @TestVariableAnnotaion(name = "node")
    private Node node = null;
    public J21_2() {
        // Node 인스턴스 생성
        node = new Node();
        // print함수 호출
        node.print();
    }

    // 시작 함수
    public static void main(String ...args) {
        new J21_2();
    }

}
