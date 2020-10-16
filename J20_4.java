import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// Node20_4 클래스
class Node20_4 {
    // 멤버 변수
    private int data;
    // 생성자
    public Node20_4(int data) {
        this.data = data;
    }
    // 멤버 변수 출력
    public int getData() {
        return this.data;
    }
}

public class J20_4 {
    // 실행 함수
    public static void main(String ...args) {
        // 0부터 9까지의 데이터가 있는 Node20_4 클래스의 리스트
        List<Node20_4> list = new ArrayList<>();
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            // Node20_4 인스턴스 생성
            list.add(new Node20_4(i));
        }
        // 스트림 식으로 변환
        Stream<Node20_4> stream = list.stream();
        // list의 값을 필터한다.
        stream = stream.filter(x -> x.getData() % 2 == 1);
        // 결과는 list로 내보낸다.
        List<Node20_4> odds = stream.collect(Collectors.toList());
        // odds를 stream으로 변환해서 for-each한다.
        odds.stream().forEach(x -> {
                // 콘솔 출력
                System.out.println(x.getData());
            });
    }

}
