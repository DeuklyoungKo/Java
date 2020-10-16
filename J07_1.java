public class J07_1 {
    // 맴버 변수
    private int a;
    // 생성자
    public J07_1(int data) {
        // 생성자로 받은 데이터를 맴버 변수 a에 넣는다.
        this.a = data;
    }
    // 반환 값이 int형인 함수 void가 아니면 반드시 return이 있어야 한다.
    public int func() {
        // this를 붙이면 맴버 변수를 뜻 함. 즉 맴버 변수 a를 반환한다.
        return this.a;
    }
    // 반환이 필요없는 함수 반환값이 void이기 때문에 return이 필요없다.
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("Print!");
    }
    // main 함수
    public static void main(String ...args) {
        // J07_1 클래스 생성
        J07_1 p = new J07_1(10);
        // 변수 p(J07_1 클래스)의 func함수 호출하여 int형을 반환 받음
        int ret = p.func();
        // 콘솔 출력
        System
            .out
            .println("ret = " + ret);
        // 변수 p(J07_1 클래스)의 print함수 호출
        p.print();
    }

}
