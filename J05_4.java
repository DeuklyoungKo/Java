// List를 사용하기 위해서는 import는 해야 한다.
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class J05_4 {
    // 실행 함수
    public static void main(String[] args) {
        // 인터페이스에의 제네릭에 사용할 데이터 타입을 선언한다. 원시적 데이터 타입(Primitive Type)은 허용하지 않습니다. 선언부의
        // 제네릭에서 데이터 타입을 지정했으면 할당부의 제네릭에서는 데이터 타입이 생략 가능합니다.
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        // List에서는 개수를 지정하지 않으니 몇개를 넣을 수도 뺄수도 있다.
        array.add(10);
        array.add(200);
        array.add(1000);
        array.add(30000);
        // 0번째 값을 제거
        array.remove(0);
        // 개수 만큼 출력
        for (int i = 0; i < array.size(); i++) {
            // 콘솔 출력
            System
                .out
                .println("array (" + i + ") = " + array.get(i));
        }
        // 사용법은 ArrayList와 같다. 그러나 처리 속도가 다르다.
        linked.add(200);
        linked.add(300);
        // 개수 만큼 출력
        for (int i = 0; i < linked.size(); i++) {
            // 콘솔 출력
            System
                .out
                .println("linked (" + i + ") = " + linked.get(i));
        }
    }

}