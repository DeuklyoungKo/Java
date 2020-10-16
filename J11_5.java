public class J11_5 {
    // 실행 함수
    public static void main(String ...args) {
        // 변수 선언
        String a = new String("hello world");
        String b = "hello world";
        String c = "hello world";
        // 콘솔 출력
        System
            .out
            .println("a == b - " + (
                a == b
            ));
        System
            .out
            .println("a equals b - " + (
                a.equals(b)
            ));
        System
            .out
            .println("b == c - " + (
                b == c
            ));

        System.out.println("a.hashCode() : " + a.hashCode());
        System.out.println("b.hashCode() : " + b.hashCode());
        System.out.println("c.hashCode() : " + c.hashCode());

    }

}
