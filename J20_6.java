import java.util.ArrayList;
import java.util.List;
// Node20_6 클래스
class Node20_6 {
    // 멤버 변수
    private int data;
    // 생성자
    public Node20_6(int data) {
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

public class J20_6 {
    // 실행 함수
    public static void main(String ...args) {
        // 0부터 9까지의 데이터가 있는 Node20_6 클래스의 리스트
        List<Node20_6> list = new ArrayList<>();
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            // Node20_6 인스턴스 생성
            list.add(new Node20_6(i));
        }
        // 병렬 처리가 가능합니다.
        list.parallelStream().forEach(x -> {
                // 데이터에 10을 곱해서 저장
                x.setDate(x.getData() * 10);
                // 콘솔 출력
                System.out.println(x.getData());
            });
        // 개행 출력
        System.out.println();
        // 소트.. 내림차순..
        list.stream().sorted((x, y) -> {
                // sort의 return 값은 int형입니다. -1이 되면 내림차순, 1이 되면 올림차순입니다.
                return Integer.compare(y.getData(), x.getData());
            })
            .forEach(x -> {
                // 콘솔 출력
                // System.out.println(x.getData());
            });
    }

}