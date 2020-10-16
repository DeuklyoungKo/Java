import java.util.List;
import java.util.ArrayList;

public class J07_2 {
    // 맴버 변수 입금에 관계된 변수
    private List<Integer> input;
    // 출금에 관계된 변수
    private List<Integer> output;
    // 생성자
    public J07_2() {
        // 리스트를 할당한다.
        this.input = new ArrayList<>();
        this.output = new ArrayList<>();
    }
    // 입금을 한다.
    public void input(int money) {
        // 맴버 변수에 금액을 추가한다.
        this
            .input
            .add(money);
    }
    // 출금을 한다.
    public void output(int money) {
        // 맴버 변수에 금액을 추가한다.
        this
            .output
            .add(money);
    }
    // 계산한다.
    public int calculator() {
        // 결과를 위한 변수
        int sum = 0;
        // 리스트에 저장된 모든 입금 금액을 더한다.
        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);
        }
        // 리스트에 저장된 모든 출금 금액을 뺀다.
        for (int i = 0; i < output.size(); i++) {
            sum -= output.get(i);
        }
        // 결과를 반환
        return sum;
    }
    // main 함수
    public static void main(String ...args) {
        // Privatefinance를 선언
        J07_2 p = new J07_2();
        // 5만원 입금
        p.input(50000);
        // 2천원 삼각 김밥 사먹음.
        p.output(2000);
        // 3천원 피시방
        p.output(3000);
        // 만원 점심 값
        p.output(10000);
        // 현재 잔액은?
        System
            .out
            .println("Current Balance - " + p.calculator());
    }

}
