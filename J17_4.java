// 일반 Sub 클래스
class Sub {
    // 맴버 변수
    private int data;
    // 생성자로 데이터를 받는다.
    public Sub(int data) {
        this.data = data;
    }
    // 출력한다.
    public int data() {
        return this.data;
    }
}

// 제네릭을 이용한 인터페이스
// T 제네릭은 Sub 클래스나 Sub 클래스를 상속 받는 데이터 타입으로 한정하빈다.
interface Callable4<T extends Sub, V> {
    V call(T data);
}

// Callable 인터페이스를 상속
class Test4 implements Callable4<Sub, String > {
    // T는 Sub 클래스를, V는 String으로 재설정한다.
    @Override
    public String call(Sub sub) {
        return  "Parameter - " + sub.data();
    }
}

public class J17_4 {
    // 실행 함수
    public static void main(String... args) {
        // Test 인스턴스 생성
        Test4 test = new Test4();
        // Sub 인스턴스 생성
        Sub sub = new Sub(10);
        // Test 클래스의 call 함수에 sub 클래스를 넣으면 10이 나온다.(※이것이 디자인 패턴의 빌드 패턴)
        System.out.println(test.call(sub));
    }

}
