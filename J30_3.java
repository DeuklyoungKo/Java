import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
// 테스트할 클래스
class Node30_3 {
    // 멤버 변수
    private String data = "init";
    // 생성자
    public Node30_3() {
        // 콘솔 출력
        System
            .out
            .println("Node30_3() constructor");
    }
    // 생성자 String 파라미터가 있다.
    public Node30_3(String data) {
        // 멤버 변수에 입력
        this.data = data;
        // 콘솔 출력
        System
            .out
            .println("Node30_3(String) constructor");
    }
    // 출력 함수
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("data - " + data);
    }
    // 멤버 변수 값 수정 함수
    public void setData(String data) {
        // 멤버 변수 값 수정
        this.data = data;
    }
    // 멤버 변수 값 반환 함수
    public String getData() {
        // 멤버 변수 값 반환
        return this.data;
    }
}

public class J30_3 {
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
            // 생성자를 통해 newInstance 함수를 호출하여 Node30_3 인스턴스를 생성한다.
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

            System.out.println("params:"+params);
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
        // 클래스를 받아온다.
        Object instance = getClass("Node30_3", "hello world");
        // print 함수 실행
        executeMethod(instance, "print");
        // setData 함수 실행, 파라미터가 있기 때문에 값을 넣는다.
        executeMethod(instance, "setData", "good");
        // getData 함수를 실행해서 멤버 변수를 받는다.
        String data = executeMethod(instance, "getData");
        // 콘솔 출력
        System.out.println("Node30_3 data - " + data);
    }

}
