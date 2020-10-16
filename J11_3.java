import java.lang.Math;

public class J11_3 {
    // 실행 함수
    public static void main(String ...args) {
        // 변수 선언 - 값이 커지면 overflow로 값이 다르게 나올 수 있기 때문에 작은 값으로 표현한다.
        String a = "hello";
        // 콘솔 출력
        System
            .out
            .println("a hashCode - " + a.hashCode());
        // a를 char 배열로.
        char[] c = a.toCharArray();
        // 해쉬 코드 계산
        int hashCode = calcHashCode(c, c.length - 1, 0);
        // 콘솔 출력
        System
            .out
            .println("calc hashCode = " + hashCode);
    }
    // 해쉬 값 계산하기.
    public static int calcHashCode(char[] array, int p, int n) {
        if (p < 0) {
            return 0;
        }
        // s[0]*31^(n - 1) + s[1]*31^(n - 2) + ... + s[n - 1]
        return array[p] * (int)Math.pow(31, n) + calcHashCode(array, p - 1, n + 1);
    }

}
