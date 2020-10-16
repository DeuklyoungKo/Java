// 추상 클래스 AbstractClass13_2
abstract class AbstractClass13_2 {
    // 맴버 변수
    private int data;
    // 실행 함수
    public void run() {
        // init 함수를 호출하여 데이터를 받는다.
        this.data = init();
        // 맴버 변수에 10을 곱한다.
        this.data = this.data * 10;
        // execute 함수를 호출하여 데이터를 계산하여 받는다.
        this.data = execute(this.data);
        // 맴버 변수에 10을 곱한다.
        this.data = this.data * 10;
        // print 함수를 호출한다.
        print(this.data);
    }
    // 추상 메소드 정의
    protected abstract int init();
    protected abstract int execute(int data);
    protected abstract void print(int data);
}
// AbstractClass13_2를 상속받았다.
class AClass13_2 extends AbstractClass13_2 {
    // init 함수를 재정의 한다.
    @Override protected int init() {
        // 1의 값을 리턴한다.
        return 1;
    }
    // execute 함수를 재정의 한다.
    @Override protected int execute(int data) {
        // 데이터를 5로 나눈 값을 리턴한다.
        return data / 5;
    }
    // print 함수를 재정의 한다.
    @Override
    protected void print(int data) {
        // 데이터를 출력한다.
        System
            .out
            .println("Data - " + data);
    }
}

public class J13_2 {
    // 실행 함수
    public static void main(String ...args) {
        // AClass13_2 클래스를 선언
        AClass13_2 clz = new AClass13_2();
        // run 함수를 실행
        clz.run();
        clz.print(11);
    }

}
