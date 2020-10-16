public class J03_3 {
    // 실행 함수
    public static void main(String[] args) {
        // 2진수    10진수  16진수 
        // 0001     1       0x1
        // 0011     3       0x3
        // 0111     7       0x7
        // 1111     15      0xf 
        // a는 0001
        int a = 0x1;
        // b는 1111
        int b = 0xf;
        // 0001 &1111
        // -------
        // 0001
        int c = a & b;
        // c = 1
        System
            .out
            .println("c = " + c);
    }

}
