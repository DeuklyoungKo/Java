public class J11_2 {
    // 실행 함수
    public static void main(String ...args) {
        // 변수 선언
        String a = "hello world1";
        String b = "hello world1";
        String c = new String("hello world2");
        // 콘솔 출력
        System
            .out
            .println("a hashCode - " + a.hashCode());
        System
            .out
            .println("b hashCode - " + b.hashCode());
        System
            .out
            .println("c hashCode - " + c.hashCode());
    }

}
