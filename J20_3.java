import java.util.ArrayList;
import java.util.List;
// Node20_3 클래스
class Node20_3 {
    // 멤버 변수
    private int data;
    // 생성자
    public Node20_3(int data) {
        this.data = data;
    }
    // 멤버 변수 출력
    public int getData() {
        return this.data;
    }
}

public class J20_3 {
    // 실행 함수
    public static void main(String ...args) {
        // 0부터 9까지의 데이터가 있는 Node20_3 클래스의 리스트
        List<Node20_3> list = new ArrayList<>();
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            // Node20_3 인스턴스 생성
            list.add(new Node20_3(i));
        }
        // 홀수의 값만 list에서 탐색해서 분류할 리스트
        List<Node20_3> odds = new ArrayList<>();
        // while의 iterator 패턴을 한줄로 줄였다.
        for (Node20_3 Node20_3 : list) {
            // Node20_3의 data가 홀수인 것만
            if (Node20_3.getData() % 2 == 1) {
                // 홀수 리스트에 넣는다.
                odds.add(Node20_3);
            }
        }
        // while의 iterator 패턴을 한줄로 줄였다.
        for (Node20_3 Node20_3 : odds) {
            // 콘솔 출력
            System
                .out
                .println(Node20_3.getData());
        }
    }

}
