import java.util.ArrayList;
import java.util.List;
// 학급 클래스
class SchoolClass2 {
    // 학생 리스트
    private final List<String> peoples = new ArrayList<>();
    // 국어 리스트
    private final List<Integer> korean = new ArrayList<>();
    // 수학 리스트
    private final List<Integer> english = new ArrayList<>();
    // 영어 리스트
    private final List<Integer> math = new ArrayList<>();
    // 학생 추가 함수, 이름과 국어, 영어, 수학 성적을 받는다.
    public void addPeople(String name, int korean, int english, int math) {
        // 리스트의 배열 위치로 학생의 성적을 찾는다. 학생 추가
        this
            .peoples
            .add(name);
        // 국어 성적 추가
        this
            .korean
            .add(korean);
        // 영어 성적 추가
        this
            .english
            .add(english);
        // 수학 성적 추가
        this
            .math
            .add(math);
    }
}

public class J14_2 {
    // 실행 함수
    public static void main(String ...args) {
        // 학급을 할당한다.
        SchoolClass2 schoolclass = new SchoolClass2();
        // 학생을 임의로 추가한다.
        schoolclass.addPeople("A", 50, 60, 70);
        schoolclass.addPeople("B", 70, 20, 50);
        schoolclass.addPeople("C", 60, 70, 40);
        schoolclass.addPeople("D", 30, 80, 30);
        schoolclass.addPeople("E", 50, 100, 50);
        schoolclass.addPeople("F", 70, 70, 60);
        schoolclass.addPeople("G", 90, 40, 40);
        schoolclass.addPeople("H", 100, 100, 90);
        schoolclass.addPeople("I", 40, 50, 10);
        schoolclass.addPeople("J", 60, 70, 30);
    }

}
