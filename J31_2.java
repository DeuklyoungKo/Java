/*

import static org.junit.Assert. *;
import java.lang.reflect.Field;
import org.junit.Test;

class Node31_2 {
    // private 타입입니다.
    private int data = 0;
    // 멤버 변수 설정
    public void setData(int data) {
        this.data = data;
    }
    // 멤버 변수 리턴
    public int getData() {
        return this.data;
    }
}

public class J31_2 {
    @Test
    private static void test() {
        try {
            // 인스턴스 생성
            Node31_2 Node31_2 = new Node31_2();
            // data 필드에 100를 넣는다.
            Node31_2.setData(100);
            // Reflection으로 data 변수를 취득한다.
            Field field = Node31_2.class.getDeclaredField("data");
            // setAccessible는 private, protected도 접근 가능하게 한다.
            field.setAccessible(true);
            // 테스트 검사
            assertEquals(field.get(Node31_2), 100);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}

*/