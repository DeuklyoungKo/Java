import java.util.ArrayList;
import java.util.List;
// 추상 클래스 AbstractClass
abstract class AbstractClass {
    // 함수 설정
    public void run() {
        // print()함수를 호출한다.
        print();
    }
    // print()는 함수명만 정의하고 실제 실행 영역은 상속받는 클래스에 맡긴다.
    protected abstract void print();
}
// AbstractClass를 상속받았다.
class AClass13_1 extends AbstractClass {
    // AbstractClass클래스의 print 함수는 함수명만 정의되어 있기 때문에 재정의를 해야한다.
    @Override
    protected void print() {
        // 콘솔 출력
        System
            .out
            .println("AClass13_1 print!");
    }
}
//AbstractClass를 상속받았다.
class BClass13_1 extends AbstractClass {
    // AbstractClass클래스의 print 함수는 함수명만 정의되어 있기 때문에 재정의를 해야한다.
    @Override
    protected void print() {
        // 콘솔 출력
        System
            .out
            .println("BClass13_1 print!");
    }
}

public class J13_1 {
    // 실행 함수
    public static void main(String ...args) {
        // 리스트 선언
        List<AbstractClass> list = new ArrayList<>();
        // AClass13_1 할당
        list.add(new AClass13_1());
        // BClass13_1 할당
        list.add(new BClass13_1());
        // 리스트에서 클래스를 취득한다.
        for (int i = 0; i < list.size(); i++) {
            AbstractClass clz = list.get(i);
            // run 함수 실행
            clz.print();
        }
    }

}