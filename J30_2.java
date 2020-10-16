import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
// 테스트할 클래스
class Node30_2 {
    // 생성자
    public Node30_2() {}
    // 함수 생성 (파라미터가 없음)
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("print");
    }
    // 함수 생성 (파라미터가 String 타입 하나 있음)
    public void print(String msg) {
        // 콘솔 출력
        System
            .out
            .println("print " + msg);
    }
    // 함수 생성 (파라미터가 String, int 타입 있음)
    public void print(String msg, int count) {
        // 콘솔 출력
        System
            .out
            .println("print " + msg + " count - " + count);
    }
}

public class J30_2 {
    // 실행 함수
    public static void main(String ...args) {
        try {
            // Node30_2 클래스의 타입을 찾는다.
            Class<?> cls = Class.forName("Node30_2");
            // Node30_2 클래스의 생성자를 취득한다.
            Constructor<?> constructor = cls.getConstructor();
            // 생성자를 통해 newInstance 함수를 호출하여 Node30_2 인스턴스를 생성한다.
            Object Node30_2 = constructor.newInstance();
            // Node30_2 클래스에서 파라미터가 없는 print함수를 취득한다.
            Method method = cls.getMethod("print");
            // 취득한 함수에 생성한 인스턴스를 넣고 실행시킨다.
            method.invoke(Node30_2);
            // Node30_2 클래스에서 String 파라미터를 가진 print함수를 취득한다.
            method = cls.getMethod("print", String.class);
            // 취득한 함수에 생성한 인스턴스와 파라미터 값을 넣고 실행시킨다.
            method.invoke(Node30_2, "test");
            // Node30_2 클래스에서 String, int 파라미터를 가진 print함수를 취득한다.
            method = cls.getMethod("print", String.class, Integer.TYPE);
            // 취득한 함수에 생성한 인스턴스와 파라미터 값을 넣고 실행시킨다.
            method.invoke(Node30_2, "test2", 100);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
