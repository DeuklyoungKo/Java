import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
// 테스트할 클래스
class Node30_1 {
    // 생성자
    public Node30_1() {}
    // 함수 생성
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("Hello world");
    }
}

public class J30_1 {
    // 실행 함수
    public static void main(String ...args) {
        try {
            // Node30_1 클래스의 타입을 찾는다.
            Class<?> cls = Class.forName("Node30_1");
            // Node30_1 클래스의 생성자를 취득한다.
            Constructor<?> constructor = cls.getConstructor();
            // 생성자를 통해 newInstance 함수를 호출하여 Node30_1 인스턴스를 생성한다.
            Object Node30_1 = constructor.newInstance();
            // Node30_1 클래스의 print함수를 취득한다.
            Method method = cls.getMethod("print");
            // 취득한 함수에 생성한 인스턴스를 넣고 실행시킨다.
            method.invoke(Node30_1);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
