// 테스트할 클래스
class Node1 {
    // 생성자
    public Node1() {}
    // 함수를 재정의 했다.
    @Override
    public String toString() {
        return "Node1";
    }
}
// 테스트할 클래스
class Node2 {
    // 생성자
    public Node2() {}
    // 함수를 재정의 했다.
    @Override
    public String toString() {
        return "Node2";
    }
}
// 테스트할 클래스
class Node3 {
    // 생성자
    public Node3() {}
    // 함수를 재정의 했다.
    @Override public String toString() {
        return "Node1";
    }
}

public class J29_4 {
    // 클래스 취득 함수
    private static Object getClass(String name) {
        // 파라미터 값이 Node1일 경우 Node1클래스를 반환
        if ("Node1".equals(name)) {
            return new Node1();
            // 파라미터 값이 Node2일 경우 Node2클래스를 반환
        } else if ("Node2".equals(name)) {
            return new Node2();
            // 파라미터 값이 Node3일 경우 Node3클래스를 반환
        } else if ("Node3".equals(name)) {
            return new Node3();
        }
        return null;
    }
    // 실행 함수
    public static void main(String ...args) {
        // 클래스를 받아온다.
        Object instance = getClass("Node1");
        // 콘솔 출력
        System
            .out
            .println(instance.toString());
    }

}
