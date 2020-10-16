import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
// 테스트할 클래스
class Node30_4 {
    // 생성자
    public Node30_4() {}
    // 출력 함수
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("print");
    }
    // 실행 함수
    public void execute() {
        // 콘솔 출력
        System
            .out
            .println("execute");
    }
}

public class J30_4 {
    // 클래스 취득 함수
    private static Object getClass(String name, Object ...args) {
        try {
            // Class.forName의 함수를 사용해서 문자열로 Class<?> 타입을 취득해 올 수 있다.
            Class<?> clz = Class.forName(name);
            // 파라미터를 가변으로 받았기 때문에 파라미터의 데이터 타입을 구해야 한다.
            Class<?> [] params = new Class<?> [args.length];
            // 파라미터의 개수만큼
            for (int i = 0; i < args.length; i++) {
                // 타입 추출
                params[i] = args[i].getClass();
            }
            // String으로 취득한 클래스 타입으로 생성자를 취득합니다.
            Constructor<?> constructor = clz.getConstructor(params);
            // 생성자를 통해 newInstance 함수를 호출하여 Node30_4 인스턴스를 생성한다.
            return constructor.newInstance(args);
        } catch (Throwable e) {
            return null;
        }
    }
    // 함수 실행 함수
    private static <T> T executeMethod(
        Object instance,
        String name,
        Object ...args
    ) {
        try {
            // 파라미터를 가변으로 받았기 때문에 파라미터의 데이터 타입을 구해야 한다.
            Class<?> [] params = new Class<?> [args.length];
            // 파라미터의 개수만큼
            for (int i = 0; i < args.length; i++) {
                // 타입 추출
                params[i] = args[i].getClass();
            }
            // 인스턴스의 클래스 타입에서 메소드를 찾는다.
            Method method = instance
                .getClass()
                .getMethod(name, params);
            // 실행
            return (T)method.invoke(instance, args);
        } catch (Throwable e) {
            return null;
        }
    }
    // 실행 함수
    public static void main(String ...args) {
        if (args.length > 0) {
            // 클래스를 받아온다.
            Object instance = getClass("Node30_4");
            executeMethod(instance, args[0]);
        }
    }

}
