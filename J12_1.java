// 상위 클래스 AClass
class AClass {
    // 함수
    public void func() {
        // 콘솔 출력
         System.out.println("AClass func");
    }
}
// 상위 클래스 BClass
class BClass {
    // 함수
    public void func() {
        // 콘솔 출력
         System.out.println("BClass func");
    }
}

// public class J12_1  extends AClass, BClass {
public class J12_1  extends BClass {
    // 함수
    @Override 
    public void func() {
        // 상위 클래스 호출
        super.func();
    }

}
