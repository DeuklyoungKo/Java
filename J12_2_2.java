// 상위 클래스 AClass
class AClassEx2 {
    // 함수
    public void func() {
        // 콘솔 출력
        System
            .out
            .println("AClass func");
    }
}

// AClass를 상속받은 클래스
class CClassEx1 extends AClassEx2 {


    public void print2(){
        System
            .out
            .println("print2!!");
    }

    // 함수
    @Override
    public void func() {
        // 콘솔 출력
        System
            .out
            .println("CClass func!!");
    }
}

public class J12_2_2 {
    public static void main(String ...args) {
        AClassEx2 aEx = new CClassEx1();
        aEx.func();
    }

}
