public class J28_3 {
    // 실행 함수
    public static void main(String[] args) {
        try {
            // 파일로 저장할 test 변수 선언
            String test = "한글입니다.";
            // String 타입을 utf-8 형식의 바이너리로 변환
            byte[] binary = test.getBytes("UTF-8");

            System.out.println(binary);

            // UTF-8코드를 ASCII코드로 String으로 변환
            String test1 = new String(binary, "ASCII");
            // 당연히 깨질 듯!
            System.out.println(test1);
            // UTF-8코드를 String으로 변환
            String test2 = new String(binary, "UTF-8");
            // 콘솔 출력
            System
                .out
                .println(test2);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
