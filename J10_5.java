public class J10_5 {
    // 문자열 초기화
    public static void initString(String ex) {
        // 초기화
        ex = "";
    }

    public static String initString2(String ex) {
        // 초기화
        ex = "1";
        return ex;
    }

    // 실행 함수
    public static void main(String ...args) {
        // 문자열 선언
        String ex = "Hello world";
        // 초기화
        initString(ex);
        // 콘솔 출력
        System
            .out
            .println("ex - " + ex);



        String ex2 = initString2(ex);
        // 콘솔 출력
        System
            .out
            .println("ex2 - " + ex2);

        System.out.println("ex.hashCode() : " + ex.hashCode());
        System.out.println("ex2.hashCode() : " + ex2.hashCode());


    }

}
