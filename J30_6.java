import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
// 테스트할 클래스
class Node30_6 {
    // 생성자
    public Node30_6() {}
    // 출력 함수 (private로 외부에서는 접근이 제한됨)
    private void print() {
        // 콘솔 출력
        System
            .out
            .println("print");
    }
    // 실행 함수 (private로 외부에서는 접근이 제한됨)
    private void execute() {
        // 콘솔 출력
        System
            .out
            .println("execute");
    }
}

public class J30_6 {
    // 실행 함수
    public static void main(String ...args) {
        try {
            // Class.forName의 함수를 사용해서 문자열로 Class<?> 타입을 취득해 올 수 있다.
            Class<?> clz = Class.forName("Node30_6");
            // Node30_6 클래스의 생성자를 취득한다.
            Constructor<?> constructor = clz.getConstructor();
            // 생성자를 통해 newInstance 함수를 호출하여 Node30_6 인스턴스를 생성한다.
            Object Node30_6 = constructor.newInstance();
            // 함수를 취득한다.
            for (Method method : clz.getDeclaredMethods()) {
                // 접근 제한자 무시하고 접근이 가능하게 한다.
                method.setAccessible(true);
                // 실행
                method.invoke(Node30_6);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
