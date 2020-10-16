import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
// 어노테이션 생성 (함수용) RUNTIME 설정하지 않으면 실행할 때 getDeclaredAnnotations로 탐색이 되지 않는다.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface AutoExecute {
    public int value()default 0;
}
// 상위 클래스
class Abstract32_3 {
    // 생성자
    public Abstract32_3() {
        try {
            // 함수를 취득
            for (Method method : J32_3.class.getDeclaredMethods()) {
                // AutoExecute 어노테이션을 취득
                AutoExecute anno = method.getDeclaredAnnotation(AutoExecute.class);

                // 가지고 있다면?
                if (anno != null) {
                    // 접근 제한자 무시
                    method.setAccessible(true);
                    // 함수 실행
                    method.invoke(this);
                }
            }
        } catch (Throwable e) {
            // 에러 콘솔 출력
            e.printStackTrace();
        }
    }
}

public class J32_3 extends Abstract32_3 {
    // 자동 실행 어노테이션 설정
    @AutoExecute
    // 함수 설정
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("print");
    }
    // 자동 실행 어노테이션 설정
    @AutoExecute
    // 함수 설정
    public void run() {
        // 콘솔 출력
        System
            .out
            .println("run");
    }
    // 자동 실행 어노테이션 설정
    @AutoExecute
    // 함수 설정
    public void test() {
        // 콘솔 출력
        System
            .out
            .println("test");
    }
    // 함수 설정
    public void close() {
        // 콘솔 출력
        System
            .out
            .println("close");
    }
    // 실행 함수
    public static void main(String[] args) {
        new J32_3();
    }

}
