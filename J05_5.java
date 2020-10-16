// Map를 사용하기 위해서는 import는 해야 한다.
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class J05_5 {
    // 실행 함수
    public static void main(String[] args) {
        // 두 개의 제네릭 타입을 선언한다. 첫번째 제네릭은 키의 타입이고 두번째 제네릭은 데이터 타입이다.
        Map<Integer, String> hash = new HashMap<>();
        Map<Integer, String> tree = new TreeMap<>();
        // 키 10으로 지정된 hello 데이터를 삽입한다.
        hash.put(10, "hello");
        // 키 20으로 지정된 world 데이터를 삽입한다.
        hash.put(20, "world");
        // 키가 20인 데이터를 출력한다.
        System
            .out
            .println("hashmap(20) = " + hash.get(20));
        // 키 10으로 지정된 hello 데이터를 삽입한다.
        tree.put(10, "hello");
        // 키 20으로 지정된 world 데이터를 삽입한다.
        tree.put(20, "world");
        // 키가 10인 데이터를 출력한다.
        System
            .out
            .println("treemap(10) = " + tree.get(10));
        // List처럼 키로 데이터를 삭제하는 것이 가능하다.
        tree.remove(20);
    }

}
