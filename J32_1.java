import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 생성 (클래스용) RUNTIME 설정하지 않으면 실행할 때 getDeclaredAnnotations로 탐색이 되지 않는다.
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation {
    // 기본 default값
    public String value() default "";
}

// 어노테이션 설정
@TestAnnotation("Hello world")
public class J32_1 {
    // 실행 함수
    public static void main(String[] args) {
        // Example에서 어노테이션
        Annotation[] annos = J32_1.class.getAnnotations();
        // 모든 어노테이션 출력
        for (Annotation anno : annos) {
            // 콘솔 출력
            System.out.println(anno.toString());
            // TestAnnotation 어노테이션이면,
            if (anno.annotationType() == TestAnnotation.class) {
                TestAnnotation a = (TestAnnotation)anno;
                // TestAnnotation의 value의 값 출력
                System.out.println(a.value());
            }
        }
    }

}
