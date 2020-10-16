import java.lang.reflect.Constructor;
// 테스트할 클래스
class Node29_1 {
    // 생성자
    public Node29_1() {}
    // 함수 생성
    public void print() {
        // 콘솔 출력
        System.out.println("Hello world");
    }
}

public class J29_1 {
    // 실행 함수
    public static void main(String ...args) {
        try {

            // Node29_1 클래스의 타입을 선언한다.
            Class<?> cls = Node29_1.class;

            System.out.println(Node29_1.class);
            System.out.println(cls);
            // Node29_1 클래스의 생성자를 취득한다.
            Constructor<?> constructor = cls.getConstructor();
            // 생성자를 통해 newInstance 함수를 호출하여 Node29_1 인스턴스를 생성한다.
            Node29_1 Node29_1 = (Node29_1)constructor.newInstance();
            // Node29_1 인스턴스의 print 함수를 실행한다.
            Node29_1.print();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
