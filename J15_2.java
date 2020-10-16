import java.util.ArrayList;
import java.util.List;
// 열거형 타입
enum PeopleState {
    clean,
    study,
    play,
    sleep
}
// 사람 클래스
class People15_2 {
    // 상태 리스트
    private List<PeopleState> states = new ArrayList<>();
    // 일 추가
    public void addState(PeopleState state) {
        // 중복은 입력하지 않는다.
        if (!states.contains(state)) {
            // 리스트에 추가
            states.add(state);
        }
    }
    // 출력 함수
    public void print() {
        // 상태 리스트의 값을 가져온다.
        for (int i = 0; i < states.size(); i++) {
            // 열거형은 그대로 출력하면 타입명이 출력된다.
            System
                .out
                .println(states.get(i));
        }
    }
}

public class J15_2 {
    // 실행 함수
    public static void main(String ...args) {
        // 사람 인스턴스 생성
        People15_2 p1 = new People15_2();
        // 청소하고 놀았다.
        p1.addState(PeopleState.clean);
        p1.addState(PeopleState.study);
        // 출력
        p1.print();
    }

}