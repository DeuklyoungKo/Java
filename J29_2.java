import java.lang.reflect.Constructor;
// 테스트할 클래스
class Node29_2 {
    // 생성자
    public Node29_2() {}
    // 함수를 재정의 했다.
    @Override 
    public String toString() {
        // 콘솔 출력
        System.out.println("Hello world");
        return null;
    }
}

public class J29_2 {
    // 실행 함수
    public static void main(String ...args) {
        try {
            // Class.forName의 함수를 사용해서 문자열로 Class<?> 타입을 취득해 올 수 있다.
            Class<?> clz = Class.forName("Node29_2");
            // String으로 취득한 클래스 타입으로 생성자를 취득합니다.
            Constructor<?> constructor = clz.getConstructor();
            // 생성자를 통해 newInstance 함수를 호출하여 Node29_2 인스턴스를 생성한다.
            Object Node29_2 = constructor.newInstance();
            // Node29_2 인스턴스의 toString 함수를 실행한다.
            Node29_2.toString();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
