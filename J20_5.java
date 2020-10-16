import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
// Node20_5 클래스
class Node20_5 {
    // 멤버 변수
    private int data;
    // 생성자
    public Node20_5(int data) {
        this.data = data;
    }
    // 멤버 변수 출력
    public int getData() {
        return this.data;
    }
}

public class J20_5 {
    // 실행 함수
    public static void main(String ...args) {
        // 0부터 9까지의 데이터가 있는 Node20_5 클래스의 리스트
        List<Node20_5> list = new ArrayList<>();
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            // Node20_5 인스턴스 생성
            list.add(new Node20_5(i));
        }
        // 체인 메소드 패턴 형식으로 줄줄이 엮을 수도 있고 하나의 데이터를 취득할 수도 있습니다.
        Optional<Node20_5> op = list
            .stream()
            .filter(x -> x.getData() % 2 == 1)
            .filter(x -> x.getData() % 3 == 0)
            .filter(x -> x.getData() > 5)
            .findFirst();
        // 하나의 데이터를 취득할 때는 Optional으로 반환됩니다. isPresent 값이 있나, isEmpty 값이 없나. 체크를 하고
        // get으로 데이터를 가져옵니다.
        if (op.isPresent()) {
            System.out.println(op.get().getData());
        }
    }

}
