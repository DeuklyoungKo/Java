import java.util.ArrayList;
import java.util.List;
// 국어 클래스
class Korean {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public Korean(int score) {
        this.score = score;
    }
}
// 영어 클래스
class English {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public English(int score) {
        this.score = score;
    }
}
// 수학 클래스
class Math {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public Math(int score) {
        this.score = score;
    }
}
// 학생 클래스
class People {
    // 이름
    private String name;
    // 국어 성적
    private Korean korean;
    // 영어 성적
    private English english;
    // 수학 성적
    private Math math;
    // 생성자로 이름과 점수를 받는다.
    public People(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = new Korean(korean);
        this.english = new English(english);
        this.math = new Math(math);
    }
}
// 학급 클래스
class SchoolClass {
    // 학급 인원 리스트
    private final List<People> peoples = new ArrayList<>();
    // 학생 추가 함수, 이름과 국어, 영어, 수학 성적을 받는다.
    public void addPeople(String name, int korean, int english, int math) {
        // 학생을 추가한다.
        peoples.add(new People(name, korean, english, math));
    }
}

public class J14_1 {
    // 실행 함수
    public static void main(String ...args) {
        // 학급을 할당한다.
        SchoolClass schoolclass = new SchoolClass();
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
