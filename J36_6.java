// 테스트 클래스
class Node36_6 {
    // 맴버 변수
    private int Node36_6;
    // 맴버 변수의 getter
    public int getNode() {
        return Node36_6;
    }
    // 맴버 변수의 setter
    public void setNode(int Node36_6) {
        this.Node36_6 = Node36_6;
    }
}

public class J36_6 implements Runnable {
    // 실행 함수
    public static void main(String ...args) {
        // 인스턴스 생성
        J36_6 test = new J36_6();
        // run 함수 호출
        test.run();
    }
    // Runnable 인터페이스의 run함수 재정의
    @Override
    public void run() {
        // 인스턴스 생성
        Node36_6 Node36_6 = new Node36_6();
        // 데이터 설정
        Node36_6.setNode(0);
        // 함수 호출 - node가 0이면 true, 1이면 false
        if (trans(Node36_6)) {
            // node가 true로 되었다면 Node36_6 값은 1로 바뀌었음 인스턴스 값 콘솔 출력
            System
                .out
                .println(Node36_6.getNode());
        }
    }
    // 값 반환의 종류 클래스는 파라미터, 데이터는 반환식으로 반환한다.
    public boolean trans(Node36_6 Node36_6) {
        // Node36_6 node값이 0이면 1을 반환한다. node가 0이 아니면 변하지 않느다
        if (Node36_6.getNode() == 0) {
            // Node36_6 클래스 값 수정
            Node36_6.setNode(1);
            // 반환은 true로
            return true;
        }
        // 반환은 false로
        return false;
    }

}
