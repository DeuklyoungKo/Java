import java.nio.ByteBuffer;
public class J28_4 {
    // 실행 함수
    public static void main(String ...args) {
        // int의 크기만큼 버퍼 생성
        ByteBuffer data = ByteBuffer.allocate(Integer.BYTES);
        // int형 값 10을 넣음
        data.putInt(10);
        // byte형으로 출력
        byte[] binary = data.array();
        // 콘솔 출력
        for (byte b : binary) {
            System.out.print(b < 0 ? b + 256 : b );
            System
                .out
                .print("\t");
        }
    }

}
