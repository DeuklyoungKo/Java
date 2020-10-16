import java.nio.ByteBuffer;
public class J28_6 {
    // 실행 함수
    public static void main(String ...args) {
        // double의 크기만큼 버퍼 생성
        ByteBuffer data = ByteBuffer.allocate(Double.BYTES);
        // double형 값 10을 넣음
        data.putDouble(100.52d);
        // byte형으로 출력
        byte[] binary = data.array();
        // 콘솔 출력
        for (byte b : binary) {
            System
                .out
                .print(
                    b < 0
                        ? b + 256
                        : b
                );
            System
                .out
                .print("\t");
        }
        // 개행
        System
            .out
            .println();
        // binary를 버퍼로 생성
        ByteBuffer ret = ByteBuffer.wrap(binary);
        // 값 출력
        System
            .out
            .println(ret.getDouble());
    }

}
