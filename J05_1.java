public class J05_1 {
    // 실행 함수
    public static void main(String[] args) {
        // 배열 길이 3을 선언하면 0, 1, 2의 배열이 선언된다. array[3]은 포함되지 않는다.
        int[] array = new int[3];
        // 데이터를 입력, indexer 방식
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        // 0부터 2까지의 배열을 콘솔에 출력한다.
        for (int i = 0; i < 3; i++) {
            // 콘솔 출력
            System
                .out
                .println("array[" + i + "] = " + array[i]);
        }
        // 콘솔에 개행 출력
        System
            .out
            .println();
        // 배열에 개수를 선언하지 않고 중괄호를 통해서 튜플식으로 데이터를 입력할 수 있다.
        array = new int[]{
            9,
            8,
            7,
            6,
            5,
            4,
            3,
            2,
            1
        };
        // array의 개수만큼 콘솔에 출력한다. (array.length - 배열 개수)
        for (int i = 0; i < array.length; i++) {
            // 콘솔 출력
            System
                .out
                .println("array[" + i + "] = " + array[i]);
        }
    }

}
