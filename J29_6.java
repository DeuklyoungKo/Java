import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
// 테스트할 클래스
class Node29_6 {
    // 테스트 변수
    private String data;
    // 생성자
    public Node29_6(String data) {
        this.data = data;
    }
}

public class J29_6 {
    // 클래스 취득 함수
    private static Object getClass(String name, String param) {
        try {
            // Class.forName의 함수를 사용해서 문자열로 Class<?> 타입을 취득해 올 수 있다.
            Class<?> clz = Class.forName(name);
            // String으로 취득한 클래스 타입으로 생성자를 취득합니다.
            Constructor<?> constructor = clz.getConstructor(String.class);
            // 생성자를 통해 newInstance 함수를 호출하여 Node29_6 인스턴스를 생성한다.
            return constructor.newInstance(param);
        } catch (Throwable e) {
            return null;
        }
    }
    // 실행 함수
    public static void main(String ...args) {
        // 예제로 100만개 인스턴스 만들어 보자
        int count = 1000000;
        // 인스턴스를 저장할 리스트
        List<Object> list = new ArrayList<>(count);
        // 시작
        long startTime = System.currentTimeMillis();
        // 루프
        for (int i = 0; i < count; i++) {
            // 할당하면서 리스트에 삽입
            list.add(new Node29_6(Integer.toString(i)));
        }
        // 끝
        long endTime = System.currentTimeMillis();
        // 시간 측정
        System.out.println(endTime - startTime);
        // 리스트 비우고
        list.clear();
        // 시작
        startTime = System.currentTimeMillis();
        // 루프
        for (int i = 0; i < count; i++) {
            // 할당하면서 리스트에 삽입
            list.add(getClass("Node29_6", Integer.toString(i)));
        }
        // 끝
        endTime = System.currentTimeMillis();
        // 시간 측정
        System.out.println(endTime - startTime);
    }

}
