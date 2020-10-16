import java.util.ArrayList;
import java.util.List;
// Node20_1 클래스
class Node20_1 {
    // 멤버 변수
    private int data;
    // 생성자
    public Node20_1(int data) {
        this.data = data;
    }
    // 멤버 변수 출력
    public int getData() {
        return this.data;
    }
}

public class J20_1 {
    // 실행 함수
    public static void main(String ...args) {
        // 0부터 9까지의 데이터가 있는 Node20_1 클래스의 리스트
        List<Node20_1> list = new ArrayList<>();
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            // Node20_1 인스턴스 생성
            list.add(new Node20_1(i));
        }
        // 홀수의 값만 list에서 탐색해서 분류할 리스트
        List<Node20_1> odds = new ArrayList<>();
        // list의 크기만큼
        for (int i = 0; i < list.size(); i++) {
            // Node20_1 인스턴스를 취득
            Node20_1 Node20_1 = list.get(i);
            // Node20_1의 data가 홀수인 것만
            if (Node20_1.getData() % 2 == 1) {
                // 홀수 리스트에 넣는다.
                odds.add(Node20_1);
            }
        }
        // 홀수 리스트의 크기만큼
        for (int i = 0; i < odds.size(); i++) {
            // 콘솔 출력
            System.out.println(odds.get(i).getData());
        }
    }
}