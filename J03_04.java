public class J03_04 {
    // 실행 함수
    public static void main(String[] args) {
        // 2진수    10진수  16진수 
        // 0001     1       0x1
        int a = 0x1;
        // 1이 왼쪽으로 1이동 0010 = 2 0x2
        int b = a << 1;
        System
            .out
            .println("b = " + b);
        // 1이 오른쪽으로 1이동 0000 = 0 = 0x0;
        int c = a >> 1;
        System
            .out
            .println("c = " + c);
        // 0010 XOR 0000 = 0010
        int d = b ^ c;
        System
            .out
            .println("d = " + d);
    }

}
