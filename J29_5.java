import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

interface ComPrint{

    public void print();
}

// 테스트할 클래스
class Node129_5 implements ComPrint{
    // 생성자
    public Node129_5() {}
    // 함수를 재정의 했다.
    @Override
    public String toString() {
        return "Node129_5";
    }


    public void print(){
        System.out.println("test1");
    }
}
// 테스트할 클래스
class Node229_5 implements ComPrint {
    // 생성자
    public Node229_5() {}
    // 함수를 재정의 했다.
    @Override
    public String toString() {
        return "Node229_5";
    }

    
    public void print(){
        System.out.println("test2");
    }
}
// 테스트할 클래스
class Node329_5 implements ComPrint {
    // 생성자
    public Node329_5() {}
    // 함수를 재정의 했다.
    @Override
    public String toString() {
        return "Node129_5";
    }
    public void print(){
        System.out.println("test3");
    }
}

public class J29_5 {
    // 클래스 취득 함수
    private static Object getClass(String name) {
        try {
            // Class.forName의 함수를 사용해서 문자열로 Class<?> 타입을 취득해 올 수 있다.
            Class<?> clz = Class.forName(name);
            // String으로 취득한 클래스 타입으로 생성자를 취득합니다.
            Constructor<?> constructor = clz.getConstructor();
            // 생성자를 통해 newInstance 함수를 호출하여 Node 인스턴스를 생성한다.
            return constructor.newInstance();
        } catch (Throwable e) {
            return null;
        }
    }
    // 실행 함수
    public static void main(String ...args) {
        // 클래스를 받아온다.
        Object instance = getClass("Node129_5");
        // 콘솔 출력
        System.out.println(instance.toString());

        try{
            Class<?> cls = Class.forName("Node129_5");
            Constructor<?> constructor = cls.getConstructor();
            Object Node129_5 = constructor.newInstance();
            Method method = cls.getMethod("print");
            method.invoke(Node129_5);

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
