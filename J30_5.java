import java.lang.reflect.Method;
// 테스트할 클래스
class Node30_5 {
    // 생성자
    public Node30_5() {}
    // 출력 함수
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("print");
    }
    // 실행 함수
    public void execute(String str) {
        // 콘솔 출력
        System
            .out
            .println(str);
    }
}

public class J30_5 {
    // 실행 함수
    public static void main(String ...args) {
        try {
            // Class.forName의 함수를 사용해서 문자열로 Class<?> 타입을 취득해 올 수 있다.
            Class<?> clz = Class.forName("Node30_5");
            // 콘솔 출력
            System
                .out
                .println("*** method list ***");
            // Node30_5 클래스의 메소드 취득하기
            for (Method method : clz.getMethods()) {
                // 메소드 이름 출력
                System
                    .out
                    .println(method.getName());
            }
            // 개행
            System
                .out
                .println();
            // 콘솔 출력
            System
                .out
                .println("*** getDeclaredMethods list ***");
            // Node30_5 클래스의 메소드 취득하기
            for (Method method : clz.getDeclaredMethods()) {
                // 메소드 이름 출력
                System
                    .out
                    .println(method.getName());
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
