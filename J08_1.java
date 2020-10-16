import java.util.List;
import java.util.ArrayList;

public class J08_1 {
    // 맴버 변수 입금에 관계된 변수
    private List<Integer> input;
    // 출금에 관계된 변수
    private List<Integer> output;
    // 생성자
    public J08_1() {
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
    // input 리스트의 데이터를 취득한다.
    protected int getInput(int i) {
        // input 리스트의 데이터를 반환
        return input.get(i);
    }
    // output 리스트의 데이터를 취득한다.
    protected int getOutput(int i) {
        // output 리스트의 데이터를 반환
        return output.get(i);
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

}
