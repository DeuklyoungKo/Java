import java.util.ArrayList;
import java.util.List;
// Node20_7 클래스
class Node20_7 {
    // 멤버 변수
    private int data;
    // 생성자
    public Node20_7(int data) {
        this.data = data;
    }
    // 멤버 변수 출력
    public int getData() {
        return this.data;
    }
    // 멤버 변수 값 저장
    public void setDate(int data) {
        this.data = data;
    }
}

public class J20_7 {
    // 실행 함수
    public static void main(String ...args) {
        // 0부터 9까지의 데이터가 있는 Node20_7 클래스의 리스트
        List<Node20_7> list = new ArrayList<>();
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            // Node20_7 인스턴스 생성
            list.add(new Node20_7(i));
        }
        // Node20_7의 data가 10이 넘는 값이 존재하는가?
        if (!list.stream().anyMatch(x -> x.getData() > 10)) {
            // 콘솔 출력
            System.out.println("The data is not have it.");
        }
    }

}
