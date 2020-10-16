import java.io.Closeable;
import java.io.Serializable;
import java.util.concurrent.Executors;
// 데이터형 추상 클래스, Cloneable 인터페이스와 Serializable 인터페이스를 상속
abstract class Data implements Cloneable, Serializable {
    // Serializable 인터페이스의 직렬화 시리얼 키
    private static final long serialVersionUID = 1L;
    // Cloneable 인터페이스를 통해서 클래스를 복제할 수 있다.
    @Override
    public Data clone() {
        // 클래스 복제
        return (Data)this.clone();
    }
    // 추상 메서드
    public abstract void add()throws PrintingException;
}
// 처리형 추상 클래스, Runnable 인터페이스와 Closeable 인터페이스를 상속
abstract class Process implements Runnable, Closeable {
    // Closeable 인터페이스로 close 함수를 재선언 해야 한다.
    @Override
    public void close() {
        System
            .out
            .println("close");
    }
}
// 예외 처리 클래스, Throwable 인터페이스를 상속
class PrintingException extends Throwable {
    // Serializable 인터페이스의 직렬화 시리얼 키 (Throwable 인터페이스가 Serializable를 상속 받음)
    private static final long serialVersionUID = 1L;
    // 생성자
    public PrintingException() {
        super("PrintingException");
    }
}
// 데이터형 클래스, Data의 추상 클래스를 상속
class Entity extends Data {
    // Serializable 인터페이스의 직렬화 시리얼 키
    private static final long serialVersionUID = 1L;
    // 맴버 변수
    private int data;
    // data 맴버 변수의 getter
    public int getData() {
        return data;
    }
    // data 맴버 변수의 setter
    public void setData(int data) {
        this.data = data;
    }
    // Data 추상 클래스의 add 를 재정의
    @Override
    public void add() throws PrintingException {
        if (this.data > 50) {
            throw new PrintingException();
        }
        this.data++;
    }
}
// 처리형 클래스, Process의 추상 클래스를 상속
class PrintingProcess extends Process {
    // 맴버 변수
    private Entity entity;
    // entity 맴버 변수의 getter
    public Entity getEntity() {
        return entity;
    }
    // entity 맴버 변수의 setter
    public void setEntity(Entity entity) {
        this.entity = entity;
    }
    // Runnable 인터페이스의 run 함수 재정의
    @Override
    public void run() {
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            try {
                // transEntity 함수 호출
                transEntity(entity);
                // 콘솔 출력
                System
                    .out
                    .println(entity.getData());
            } catch (Throwable e) {
                // 예외 처리 콘솔 출력
                e.printStackTrace();
            }
        }
    }
    // 인터페이스 data를 받아서 add 함수를 호출
    private void transEntity(Data entity) throws PrintingException {
        entity.add();
    }
}

public class J36_1 {
    // 실행 ㅎ마수
    public static void main(String[] args) {
        // 자동 close 호출
        try(PrintingProcess process = new PrintingProcess()) {
            // 데이터 선언
            Entity entity = new Entity();
            // 데이터 설정
            entity.setData(10);
            // 처리형 클래스에 데이터를 입력
            process.setEntity(entity);
            // 처리형 클래스를 스레드에 넘김
            Executors.newSingleThreadExecutor().submit(process).get();  

        } catch (Throwable e) {
            // 예외 처리 콘솔 출력
            e.printStackTrace();
        }
    }

}
