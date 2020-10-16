public class J17_1 {
    // 내부 Node 클래스
    class Node {
        // 데이터를 넣을 변수
        int data;
        // 다음 포인터
        Node next;
        // 생성자
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    // 현재 Node 포인터
    private Node pointer = null;
    // add 함수는 데이터를 넣는다.
    public void add(int data) {
        // 현재 포인터에 Node를 만들어 값을 넣는다. 다음 pointer는 이전에 있던 pointer 값을 넣는다.
        System.out.println(data);
        System.out.println(pointer);
        pointer = new Node(data, pointer);
    }
    // pop 함수는 pointer의 값을 리턴한다.
    public int pop() {
        // Stack 알고리즘에 데이터가 없으면 null exception을 내보낸다.
        if (pointer == null) {
            // Null 예외 처리
            throw new NullPointerException();
        }
        try {
            System.out.println(pointer.data);
            // 현재 포인터에 있는 값을 리턴
            return pointer.data;
        } finally {
            // 포인터 이동
            pointer = pointer.next;
        }
    }
    // 현재 포인터가 null인지 확인하는 함수
    public boolean isNull() {
        return pointer == null;
    }
    // 실행 함수
    public static void main(String ...args) {
        // 연결형 Stack 클래스 선언
        J17_1 ex = new J17_1();
        // 값을 넣는다.
        ex.add(10);
        ex.add(20);
        ex.add(30);
        ex.add(40);
        int sum = 0;
        // 값을 모두 더한다.
        while (!ex.isNull()) {
            sum += ex.pop();
        }
        // 총합의 값 출력
        System
            .out
            .println("ex sum " + sum);
    }
}
