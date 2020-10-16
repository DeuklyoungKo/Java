import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
// 어노테이션 생성 (맴버 변수용) RUNTIME 설정하지 않으면 실행할 때 getDeclaredAnnotations로 탐색이 되지 않는다.
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface DependancyInjection {
    // 자동 생성할 클래스 타입. 기본은 타입은 Object
    public Class<?> value()default Object.class;
}
// 클래스
class Node_32_2 {
    // 생성자
    public Node_32_2() {}
    // 함수 생성
    public void print() {
        // 콘솔 출력
        System
            .out
            .println("Hello world");
    }
}
// 상위 클래스
class Abstract {
    // 생성자
    public Abstract() {
        try {
            // 맴버 변수를 취득
            for (Field field : J32_2.class.getDeclaredFields()) {
                // DependancyInjection 어노테이션을 취득
                DependancyInjection anno = field.getDeclaredAnnotation(
                    DependancyInjection.class
                );

                System.out.println("anno:"+anno);

                // 가지고 있다면?
                if (anno != null) {
                    // 접근 제한자 무시
                    field.setAccessible(true);
                    // value 함수 값 취득
                    Class<?> clz = anno.value();
                    Constructor<?> constructor;
                    // 만약 Object라면
                    if (clz == Object.class) {
                        // 맴버 변수의 타입을 취득
                        clz = field.getType();
                    }
                    // 생성한다.
                    constructor = clz.getConstructor();
                    // 값에 넣는다.
                    field.set(this, constructor.newInstance());
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

public class J32_2 extends Abstract {
    // 의존성 주입 어노테이션을 맴버 변수에 설정
    @DependancyInjection()
    private Node_32_2 node1;
    // 의존성 주입 어노테이션이 없는 맴버 변수
    private Node_32_2 node2;
    // 출력함수
    public void print() {
        // nod1이 null이 아니면
        if (this.node1 != null) {
            // print 함수 호출
            this
                .node1
                .print();
        } else {
            // 콘솔 출력
            System
                .out
                .println("node1 null");
        }
        // nod1이 null이 아니면
        if (this.node2 != null) {
            // print 함수 호출
            this
                .node2
                .print();
        } else {
            // 콘솔 출력
            System
                .out
                .println("node2 null");
        }
    }
    // 실행 함수
    public static void main(String[] args) {
        // J32_2 인스턴스 생성
        J32_2 ex = new J32_2();
        // 함수 호출
        ex.print();
    }

}
