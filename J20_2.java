import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Node20_2 클래스
class Node20_2 {
    // 멤버 변수
    private int data;
    // 생성자
    public Node20_2(int data) {
        this.data = data;
    }
    // 멤버 변수 출력
    public int getData() {
        return this.data;
    }
}

public class J20_2 {
    // 실행 함수
    public static void main(String ...args) {
        // 0부터 9까지의 데이터가 있는 Node20_2 클래스의 리스트
        List<Node20_2> list = new ArrayList<>();
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            // Node20_2 인스턴스 생성
            list.add(new Node20_2(i));
        }
        // 홀수의 값만 list에서 탐색해서 분류할 리스트
        List<Node20_2> odds = new ArrayList<>();
        // list의 Iterator를 취득
        Iterator<Node20_2> iter = list.iterator();
        // 다음 포인터에 값이 있는가?
        while (iter.hasNext()) {
            // 다음 포인터의 값을 가져온다.
            Node20_2 Node20_2 = iter.next();
            // Node20_2의 data가 홀수인 것만
            if (Node20_2.getData() % 2 == 1) {
                // 홀수 리스트에 넣는다.
                odds.add(Node20_2);
            }
        }
        // odds의 Iterator를 취득
        iter = odds.iterator();
        // 다음 포인터에 값이 있는가?
        while (iter.hasNext()) {
            // 다음 포인터의 값을 가져온다.
            Node20_2 Node20_2 = iter.next();
            // 콘솔 출력
            System
                .out
                .println(Node20_2.getData());
        }
    }

}
