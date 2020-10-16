// 상위 클래스 AClass
class AClassEx {

    public Integer a = 2;

    // 함수
    public void func() {
        // 콘솔 출력
        System
            .out
            .println("AClass func");
    }
}

// AClass를 상속받은 클래스
class CClassEx extends AClassEx {

    public Integer a = 1;
    // 함수
    @Override
    public void func() {
        // 콘솔 출력
        System
            .out
            .println("CClass func");
    }
}

public class J12_2_1 {
    public static void main(String ...args) {
        AClassEx aEx = new CClassEx();
        aEx.func();
        System.out.println(aEx.a);
    }

}
