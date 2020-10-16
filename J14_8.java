import java.util.ArrayList;
import java.util.List;
// 과목 인터페이스
interface ISubject {
    public int getScore();
}
// 과목 추상 클래스
abstract class AbstractSubject implements ISubject {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public AbstractSubject(int score) {
        this.score = score;
    }
    @Override
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 국어 클래스
class Korean14_8 extends AbstractSubject {
    // 부모 생성자로 넘기기
    public Korean14_8(int score) {
        super(score);
    }
}
// 영어 클래스
class English14_8 extends AbstractSubject {
    // 부모 생성자로 넘기기
    public English14_8(int score) {
        super(score);
    }
}
// 수학 클래스
class Math14_8 extends AbstractSubject {
    // 부모 생성자로 넘기기
    public Math14_8(int score) {
        super(score);
    }
}
// 학생 클래스
class People14_8 {
    // 이름
    private String name;
    // 0 - 국어, 1 - 영어, 2 - 수학
    final private List<ISubject> subjects = new ArrayList<>();
    // 총점
    private int sum;
    // 평균
    private int avg;
    // 석차
    private int rank;
    // 생성자로 이름과 점수를 받는다.
    public People14_8(String name, int Korean14_8, int English14_8, int Math14_8) {
        this.name = name;
        // 0 - 국어
        this
            .subjects
            .add(new Korean14_8(Korean14_8));
        // 1 - 영어
        this
            .subjects
            .add(new English14_8(English14_8));
        // 2 - 수학
        this
            .subjects
            .add(new Math14_8(Math14_8));
    }
    // 이름 취득 함수
    public String getName() {
        return this.name;
    }
    // 총점 취득 함수
    public int sum() {
        return this.sum;
    }
    // 평균 취득 함수
    public int avg() {
        return this.avg;
    }
    // 석차 취득 함수
    public int getRank() {
        return this.rank;
    }
    // 총점과 평균을 계산한다.
    public void init() {
        // 국어, 영어, 수학 성적을 합친다.
        this.sum = 0;
        for (int i = 0; i < this.subjects.size(); i++) {
            this.sum += this
                .subjects
                .get(i)
                .getScore();
        }
        // 총점에서 3을 나눈다.
        this.avg = this.sum / this
            .subjects
            .size();
    }
    // 석차를 계산한다.
    public void initRank(List<People14_8> People14_8s) {
        // 1등부터 시작
        int rank = 1;
        // 다른 학생과 비교한다.
        for (int i = 0; i < People14_8s.size(); i++) {
            // 다른 학생 취득
            People14_8 other = People14_8s.get(i);
            // 본인 비교는 넘긴다.
            if (other == this) {
                continue;
            }
            // 다른 학생이 성적이 더 높으면 석차를 내린다.
            if (other.sum() > this.sum()) {
                rank++;
            }
        }
        this.rank = rank;
    }
}
// 학급 클래스
class SchoolClass14_8 {
    // 학급 인원 리스트
    private final List<People14_8> People14_8s = new ArrayList<>();
    // 학생 추가 함수, 이름과 국어, 영어, 수학 성적을 받는다.
    public void addPeople14_8(String name, int Korean14_8, int English14_8, int Math14_8) {
        // 학생을 추가한다.
        People14_8s.add(new People14_8(name, Korean14_8, English14_8, Math14_8));
    }
    // 초기화 함수
    public void init() {
        // 총점과 평균을 구한다.
        for (int i = 0; i < People14_8s.size(); i++) {
            People14_8 People14_8 = People14_8s.get(i);
            People14_8.init();
        }
        // 석차를 구한다.
        for (int i = 0; i < People14_8s.size(); i++) {
            People14_8 People14_8 = People14_8s.get(i);
            People14_8.initRank(People14_8s);
        }
    }
    // 총점과 평균, 석차를 출력하는 함수
    public void print() {
        // 학급의 인원 전부 출력한다.
        for (int i = 0; i < People14_8s.size(); i++) {
            // 학생 취득
            People14_8 People14_8 = People14_8s.get(i);
            // 석차 구하기
            int rank = People14_8.getRank();
            // 콘솔 출력
            System
                .out
                .println(
                    People14_8.getName() + " total = " + People14_8.sum() + ", avg = " + People14_8.avg() + ", " +
                    "ranking = " + rank
                );
        }
    }
}

public class J14_8 {
    // 실행 함수
    public static void main(String ...args) {
        // 학급을 할당한다.
        SchoolClass14_8 SchoolClass14_8 = new SchoolClass14_8();
        // 학생을 임의로 추가한다.
        SchoolClass14_8.addPeople14_8("A", 50, 60, 70);
        SchoolClass14_8.addPeople14_8("B", 70, 20, 50);
        SchoolClass14_8.addPeople14_8("C", 60, 70, 40);
        SchoolClass14_8.addPeople14_8("D", 30, 80, 30);
        SchoolClass14_8.addPeople14_8("E", 50, 100, 50);
        SchoolClass14_8.addPeople14_8("F", 70, 70, 60);
        SchoolClass14_8.addPeople14_8("G", 90, 40, 40);
        SchoolClass14_8.addPeople14_8("H", 100, 100, 90);
        SchoolClass14_8.addPeople14_8("I", 40, 50, 10);
        SchoolClass14_8.addPeople14_8("J", 60, 70, 30);
        // 총점과 평균, 석차를 계산한다.
        SchoolClass14_8.init();
        // 성적을 출력한다.
        SchoolClass14_8.print();
        // 소스가 길어지는 관계로 상위 30%와 하위 30%는 생략함
    }

}
