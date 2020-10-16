public class J05_3 {
    // 실행 함수
    public static void main(String[] args) {
        // 배열을 3개 선언, array[0], array[1], array[2]
        int[] array = new int[3];
        // 그러나 선언하지 않는 array[3]에 데이터를 입력하면 에러가 발생한다.
        array[3] = 100;
    }

}
