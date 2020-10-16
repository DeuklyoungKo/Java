public class J04_4 {
    // 실행 함수
    public static void main(String[] args) {

        // i < 1은 영원히 true, 즉, 무한 루프 상태가 되기 때문에 이 프로그램은 종료하지 않는다.
        // for (int i = 0; i < 1; i--) {
        //     // 콘솔 출력
        //     System
        //         .out
        //         .println("i = " + i);
        // }

        // 배열 설정
        int array[] = {
            1,
            2,
            3,
            4,
            5
        };
        // iterator 패턴
        for (int item : array) {
            // 콘솔 출력
            System
                .out
                .println(item);
        }

        
    }

}
