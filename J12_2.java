import java.util.ArrayList;
import java.util.List;
// 상위 클래스 AClass
class AClass12 {
    // 함수
    public void func() {
        // 콘솔 출력
        System
            .out
            .println("AClass func");
    }
}
// 상위 클래스 BClass
class BClass12 {
    // 함수
    public void func() {
        // 콘솔 출력
        System
            .out
            .println("BClass func");
    }
}
// AClass를 상속받은 클래스
class CClass extends AClass12 {
    // 함수
    @Override public void func() {
        // 콘솔 출력
        System
            .out
            .println("CClass func");
    }
}
// BClass를 상속받은 클래스
class DClass extends BClass12 {
    // 함수
    @Override public void func() {
        // 콘솔 출력
        System
            .out
            .println("DClass func");
    }
}

public class J12_2 {
    // 실행 함수
    public static void main(String ...args) {
        // AClass 리스트
        List<AClass12> aClassList = new ArrayList<>();
        // BClass 리스트
        List<BClass12> bClassList = new ArrayList<>();
        // AClass리스트에 AClass를 할당해서 넣는다.
        aClassList.add(new AClass12());
        // CClass는 AClass를 상속받았기 때문에 AClass취급을 할 수 있다.
        aClassList.add(new CClass());
        // BClass리스트에 BClass를 할당해서 넣는다.
        bClassList.add(new BClass12());
        // DClass는 BClass를 상속받았기 때문에 BClass취급을 할 수 있다.
        bClassList.add(new DClass());
        // 리스트의 아이템을 취득
        for (int i = 0; i < aClassList.size(); i++) {
            // 아이템 취득
            AClass12 cls = aClassList.get(i);
            // 콘솔 출력
            cls.func();
        }
        // 리스트의 아이템을 취득
        for (int i = 0; i < bClassList.size(); i++) {
            // 아이템 취득
            BClass12 cls = bClassList.get(i);
            // 콘솔 출력
            cls.func();
        }
    }

}
