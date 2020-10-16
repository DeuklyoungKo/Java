class Node22_4 {
    // 멤버 면수
    private int data = 0;
    // 멤버 변수 값에 더하는 함수
    public void addData(int data) {
        this.data += data;
    }
    // 멤버 변수 값 반환 함수
    public int getData() {
        return this.data;
    }
}

public class J22_4 {
    // 실행 함수
    public static void main(String[] args) {
        try {
            // Node22_4 인스턴스 생성
            final Node22_4 Node22_4 = new Node22_4();
            // 스레드 생성
            Thread th = new Thread(() -> {
                for(int i = 0; i < 100; i++) {
                    //
                    Node22_4.addData(i);
                }
            });
            // 스레드 실행
            th.start();
            // 콘솔 출력
            System.out.println("Node22_4 - data = " + Node22_4.getData());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
