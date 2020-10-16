public class J36_5 implements Runnable {
    // 실행 함수
    public static void main(String... args) {
        // 인스턴스 생성
        J36_5 test = new J36_5();
        // run 함수 호출
        test.run();
    }
    // Runnable 인터페이스의 run함수 재정의
    @Override
    public void run() {
        // 한라인 함수 처리 금지
        System.out.println(add1(add2(add3(0))));
        // 분할
        int temp = 0;
        temp = add3(temp);
        temp = add2(temp);
        temp = add1(temp);
        // 콘솔 실행
        System.out.println(temp);
    }
    // 함수
    private int add1(int data) {
        return data + 1;
    }
    // 함수
    private int add2(int data) {
        return data + 2;
    }
    // 함수
    private int add3(int data) {
        return data + 3;
    }

}
