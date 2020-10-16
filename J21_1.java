// 람다식용 인터페이스를 설정하는 어노테이션 (메서드를 두개 선언하면 에러 발생)
@FunctionalInterface
interface LambdaExpression12 {
    void run();
}

public class J21_1 {
    // 재정의 어노테이션 (Object까지 상속)
    @Override
    public String toString() {
        return  "Hello world";
    }

    // 사용 금지를 명시하는 어노테이션
    @Deprecated
    public void print() {
        System.out.println( "print");
    }
    // 경고를 없애주는 어노테이션
    @SuppressWarnings("unused")
    public void test() {
        int aaa = 0;
    }

}
