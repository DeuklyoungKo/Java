public class J09_3 {
    // static이 키워드가 있기 떄문에 맴버 변수가 아닌 정적 변수라고 한다.
    private static int test;
    // 내부(inline) 클래스에도 static를 붙일 수 있다.
    static class Node {
        // 생성자
        public Node() {
            // 콘솔 출력
            System
                .out
                .println("Alloc Node class");
        }
    }
    // 이 함수는 static으로 Program의 할당(new)과 관계없이 호출 가능
    public static void print() {
        //
        System
            .out
            .println("Program.test = " + test);
    }
    // main 함수
    public static void main(String ...args) {
        // Program.test 변수는 정적 변수로 이는 Program 클래스와 할당된 것과 관계가 없음 10 설정
        J09_3.test = 10;
        // Program 클래스 할당
        J09_3 p = new J09_3();
        // p.test의 값을 20 설정
        p.test = 20;
        // Program 클래스의 print함수 호출 이건 확실히 p.test이니 20이 나올 것
        p.print();
        // 이건 10이 나올까? 20이 날까?
        J09_3.print();
        // static를 설정하면 Inline 클래스를 외부에서도 사용할 수 있다. 그러나 이런 방식은 사용하지 않는 편이 좋다.
        J09_3.Node node = new J09_3.Node();
    }

}