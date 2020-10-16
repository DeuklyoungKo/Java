public class J05_2 {
    // 실행 함수
    public static void main(String[] args) {
        // 다차원 배열을 이용하여 구구단을 만든다.
        int[][] multiplicationTable = new int[9][9];
        // 단 1단부터 9단까지
        for (int i = 1; i <= 9; i++) {
            // 각 단은 1부터 9까지
            for (int j = 1; j <= 9; j++) {
                // 구구단 작성. 배열의 특성상 시작이 0부터 시작하기 때문에 각 단의 -1를 하는 것으로 표현
                multiplicationTable[i - 1][j - 1] = i * j;
                // 테이블 출력
                System
                    .out
                    .print(j + " * " + i + " = " + (
                        i * j
                    ) + "\t");
            }
            System
                .out
                .println();
        }
        System
            .out
            .println();
        // 배열은 0으로 시작하기 때문에 7단은 배열 array[6]에 있음
        System
            .out
            .println("7 * 7 = " + multiplicationTable[7 - 1][7 - 1]);
        System
            .out
            .println("6 * 8 = " + multiplicationTable[6 - 1][8 - 1]);
        System
            .out
            .println("8 * 3 = " + multiplicationTable[8 - 1][3 - 1]);
    }

}
