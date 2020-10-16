class Node22_5 {
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

public class J22_5 {
    // 실행 함수
    public static void main(String[] args) {
        try {
            // Node22_5 인스턴스 생성
            final Node22_5 Node22_5 = new Node22_5();
            // 스레드 생성
            Thread th = new Thread(() -> {
                for(int i = 0; i < 100; i++) {
                    //
                    Node22_5.addData(i);
                }
            });
            // 스레드 실행
            th.start();
            // 스레드가 끝날 때까지 기다린다.
            th.join();
            // 콘솔 출력
            System
                .out
                .println("Node22_5 - data = " + Node22_5.getData());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
