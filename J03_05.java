public class J03_05 {
    // 실행 함수
    public static void main(String[] args) {
        // 사실 변수를 한글로 사용하면 안됩니다! 0x1 = 0001
        int 빨래 = 0x1;
        // 0x2 = 0010
        int 청소 = 0x2;
        // 0x4 = 0100
        int 설겆이 = 0x4;
        // 0x8 = 1000
        int 공부 = 0x8;
        // people은 빨래와 청소를 했습니다. 0001 | 0100 = 0101
        int people = 빨래 | 청소;
        // 빨래했는지 확인 제어문
        if ((빨래 & people) == 빨래) {
            // 콘솔 출력
            System
                .out
                .println("빨래 함");
        }
        // 청소했는지 확인 제어문
        if ((청소 & people) == 청소) {
            // 콘솔 출력
            System
                .out
                .println("청소 함");
        }
        // 설겆이했는지 확인 제어문
        if ((설겆이 & people) == 설겆이) {
            // 콘솔 출력
            System
                .out
                .println("설겆이 함");
        }
        // 공부했는지 확인 제어문
        if ((공부 & people) == 공부) {
            // 콘솔 출력
            System
                .out
                .println("공부 함");
        }
    }
}