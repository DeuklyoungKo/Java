import java.util.ArrayList;
import java.util.List;

public class J08_2 extends J08_1 {
    // 내부 inline 클래스, 즉, 클래스 내부에 있는 클래스로 외부에서는 접근 금지
    private class Context {
        String context;
        int type;
    }
    // 통장 내역을 저장할 변수 변수의 할당은 생성자에서 해야 하지만, 직접 맴버 변수로 해도 상관없다.
    private List<Context> context = new ArrayList<>();
    // 위 Context 클래스 생성 함수
    private Context newContext(String context, int type) {
        // Context 클래스 생성
        Context c = new Context();
        // 내역
        c.context = context;
        // 타입
        c.type = type;
        // 생성된 클래스를 리턴
        return c;
    }
    // 입금에 관한 함수 (이전 금액만 넣는 intput 함수에서 내역도 추가한다.)
    public void input(String context, int money) {
        // Context 생성
        Context c = newContext(context, 1);
        // 내역 추가
        this
            .context
            .add(c);
        // J08_1 클래스의 input 함수에 금액을 추가한다.
        super.input(money);
    }
    // 출금에 관한 함수 (이전 금액만 넣는 output 함수에서 내역도 추가한다.)
    public void output(String context, int money) {
        // Context 생성
        Context c = newContext(context, 2);
        // 내역 추가
        this
            .context
            .add(c);
        // J08_1 클래스의 output 함수에 금액을 추가한다.
        super.output(money);
    }
    // 출력 함수
    public void print() {
        // 해더 출력
        System
            .out
            .println("No\tContext\t\t입금\t\t출금");
        // 모든 내역의 순서는 context 리스트에 add 순서대로 있다. ※ for문의 변수 초기치는 하나의 변수가 아닌 복수의 변수도 가능
        for (int inputIndex = 0, outputIndex = 0, i = 0; i < context.size(); i++) {
            // context 리스트에서 Context 클래스를 취득
            Context c = context.get(i);
            int money = 0;
            if (c.type == 1) {
                // 입금 리스트에서 금액을 취득
                money = getInput(inputIndex);
                // 입금 리스트의 인덱스 증가
                inputIndex++;
                // 콘솔 출력
                System
                    .out
                    .println((i + 1) + "\t" + c.context + "\t\t" + money + "\t\t");
            } else {
                // 출금 리스트에서 금액을 취득
                money = getOutput(outputIndex);
                // 출금 리스트의 인덱스 증가
                outputIndex++;
                // 콘솔 출력
                System
                    .out
                    .println((i + 1) + "\t" + c.context + "\t\t\t\t" + money);
            }
        }
    }
    // 실행 함수
    public static void main(String ...args) {
        // Account 클래스 할당
        J08_2 account = new J08_2();
        // 통장 입금
        account.input("월급", 100000);
        // 통장 출금
        account.output("핸드폰 요금", 30000);
        // 통장 출금
        account.output("공과금", 50000);
        // 통장 내역 출력
        account.print();
        // 개행 추가
        System
            .out
            .println();
        // 콘솔 출력
        System
            .out
            .println("총 잔액 : " + account.calculator());
    }

}
