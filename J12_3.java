import java.util.ArrayList;
import java.util.List;
// 인터페이스
interface IClass {
    // func함수 정의
    public void func();
}
// 상위 클래스 AClass12_3
class AClass12_3 implements IClass {
    // 함수
    public void func() {
        // 콘솔 출력
        System
            .out
            .println("AClass12_3 func");
    }
}
// 상위 클래스 BClass12_3
class BClass12_3 {
    // 함수
    public void func() {
        // 콘솔 출력
        System
            .out
            .println("BClass12_3 func");
    }
}
// AClass12_3를 상속받은 클래스
class CClass12_3 extends AClass12_3 {
    // 함수
    @Override public void func() {
        // 콘솔 출력
        System
            .out
            .println("CClass12_3 func");
    }
}
// IClass를 상속받은 클래스 BClass12_3를 상속받은 클래스
class DClass12_3 extends BClass12_3 implements IClass {
    // 함수
    @Override public void func() {
        // 콘솔 출력
        System
            .out
            .println("DClass12_3 func");
    }
}

public class J12_3 {
    public static void main(String ...args) {
        // IClass를 변수로.
        List<IClass> IClassList = new ArrayList<>();
        // AClass12_3 할당
        IClassList.add(new AClass12_3());
        // BClass12_3 할당
        IClassList.add(new CClass12_3());
        // DClass12_3 할당
        IClassList.add(new DClass12_3());
        // 리스트의 아이템을 취득
        for (int i = 0; i < IClassList.size(); i++) {
            // 아이템 취득
            IClass cls = IClassList.get(i);
            // 콘솔 출력
            cls.func();
        }
    }

}
