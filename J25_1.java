public class J25_1 implements Cloneable {
    // Object clone은 접근 제한자가 protected이기 때문에 public으로 재정의
    public J25_1 clone() {
        try {
            // 캐스팅 변환을 해서 리턴한다.
            return (J25_1)super.clone();
        } catch (CloneNotSupportedException e) {
            // Cloneable를 상속받지 않으면 CloneNotSupportedException 에러가 발생한다.
            return null;
        }
    }
    // 실행 함수
    public static void main(String[] args) {
        // 인스턴스 선언, 모든 클래스는 Object를 상속받기 때문에 Object타입으로 받는 것이 가능하다.
        Object a = new J25_1();
        // getClass는 Reflection에서 사용되는 Class<?> 타입으로 반환되고 그 Class 타입은 선언된 클래스 힙에 있는 클래스
        // 타입입니다.
        System
            .out
            .println("getClass = " + a.getClass().getName());
        // 주소값이 hash code로 출력된다.
        System
            .out
            .println("hashCode = " + a.hashCode());
        // 이것은 주소 값을 복사
        J25_1 b = (J25_1)a;
        // 이것은 클래스를 복사
        J25_1 c = b.clone();
        // b의 hash code, a의 hash code와 값이 같다.
        System
            .out
            .println("b hashCode = " + b.hashCode());
        // c의 hash code, clone을 했기 때문에 hash code가 다르다.
        System
            .out
            .println("c hashCode = " + c.hashCode());
        // a와 b는 주소값이 같은 같은 클래스인가?
        System
            .out
            .println("a.equals(b) = " + a.equals(b));
        // a와 c는 주소값이 같은 같은 클래스인가?
        System
            .out
            .println("a.equals(c) = " + a.equals(c));
        // toString은 getClass().getName() + "@" + Integer.toHexString(hashCode())
        System
            .out
            .println("toString = " + a.toString());
    }

}
