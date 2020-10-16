import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

// 테스트할 클래스
class Node29_7 {
    // 테스트 변수
    private String data;
    // 생성자
    public Node29_7(String data) {
        this.data = data;
    }
}

public class J29_7 {
    // 실행 함수
    public static void main(String ...args) {
        try {
            // 예제로 100만개 인스턴스 만들어 보자
            int count = 1000000;
            // 인스턴스를 저장할 리스트
            List<Object> list = new ArrayList<>(count);
            // 시작
            long startTime = System.currentTimeMillis();
            // 루프
            for (int i = 0; i < count; i++) {
                // 할당하면서 리스트에 삽입
                list.add(new Node29_7(Integer.toString(i)));
            }
            // 끝
            long endTime = System.currentTimeMillis();
            // 시간 측정
            System
                .out
                .println(endTime - startTime);
            // 리스트 비우고
            list.clear();
            // Class.forName의 함수를 사용해서 문자열로 Class<?> 타입을 취득해 올 수 있다.
            Class<?> clz = Class.forName("Node29_7");
            // String으로 취득한 클래스 타입으로 생성자를 취득합니다.
            Constructor<?> constructor = clz.getConstructor(String.class);
            // 시작
            startTime = System.currentTimeMillis();
            // 루프
            for (int i = 0; i < count; i++) {
                // 할당하면서 리스트에 삽입
                list.add(constructor.newInstance(Integer.toString(i)));
            }
            // 끝
            endTime = System.currentTimeMillis();
            // 시간 측정
            System
                .out
                .println(endTime - startTime);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
