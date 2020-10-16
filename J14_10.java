import java.util.ArrayList;
import java.util.List;
// 과목 인터페이스
interface ISubject14_10 {
    public int getScore();
}
// 과목 추상 클래스
abstract class AbstractSubject14_10 implements ISubject14_10 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public AbstractSubject14_10(int score) {
        this.score = score;
    }
    @Override
    // 점수 취득 함수
    public int getScore() {
        // int형을 float형으로 캐스팅
        float buffer = (float)this.score;
        // 배율 계산
        return (int)(buffer * getRate());
    }
    // 배율을 받는다.
    protected abstract float getRate();
}
// 국어 클래스
class Korean14_10 extends AbstractSubject14_10 {
    // 부모 생성자로 넘기기
    public Korean14_10(int score) {
        super(score);
    }
    // 국어 배율은 1.2로 정의
    @Override
    public float getRate() {
        return 1.2f;
    }
}
// 영어 클래스
class English14_10 extends AbstractSubject14_10 {
    // 부모 생성자로 넘기기
    public English14_10(int score) {
        super(score);
    }
    // 영어 배율은 0.8로 정의
    @Override
    public float getRate() {
        return 0.8f;
    }
}
// 수학 클래스
class Math14_10 extends AbstractSubject14_10 {
    // 부모 생성자로 넘기기
    public Math14_10(int score) {
        super(score);
    }
    // 수학 배율은 1로 정의
    @Override
    public float getRate() {
        return 1f;
    }
}
// 선택과목 클래스
class Select extends AbstractSubject14_10 {
    // 부모 생성자로 넘기기
    public Select(int score) {
        super(score);
    }
    // 선택 과목 배율은 1로 정의
    @Override
    public float getRate() {
        return 1f;
    }
}
// 학생 클래스
class People14_10 {
    // 이름
    private String name;
    // 0 - 국어, 1 - 영어, 2 - 수학
    final private List<ISubject14_10> subjects = new ArrayList<>();
    // 총점
    private int sum;
    // 평균
    private int avg;
    // 석차
    private int rank;
    // 생성자로 이름과 점수를 받는다.
    public People14_10(String name, int Korean14_10, int English14_10, int Math14_10) {
        this.name = name;
        // 0 - 국어
        this
            .subjects
            .add(new Korean14_10(Korean14_10));
        // 1 - 영어
        this
            .subjects
            .add(new English14_10(English14_10));
        // 2 - 수학
        this
            .subjects
            .add(new Math14_10(Math14_10));
    }
    // 다형성으로 선택 과목이 추가되었다.
    public People14_10(String name, int Korean14_10, int English14_10, int Math14_10, int select) {
        // 기본 생성자로 등록
        this(name, Korean14_10, English14_10, Math14_10);
        // 3 - 선택 과목 추가
        this
            .subjects
            .add(new Select(select));
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
    public void initRank(List<People14_10> People14_10s) {
        // 1등부터 시작
        int rank = 1;
        // 다른 학생과 비교한다.
        for (int i = 0; i < People14_10s.size(); i++) {
            // 다른 학생 취득
            People14_10 other = People14_10s.get(i);
            // 본인 비교는 넘긴다.
            if (other == this) {
                continue;
            }
            // 다른 학생이 성적이 더 높으면 석차를 내린다.
            if (other.avg() > this.avg()) {
                rank++;
            }
        }
        this.rank = rank;
    }
}
// 학급 클래스
class SchoolClass14_10 {
    // 학급 인원 리스트
    private final List<People14_10> People14_10s = new ArrayList<>();
    // 학생 추가 함수, 이름과 국어, 영어, 수학 성적을 받는다.
    public void addPeople14_10(String name, int Korean14_10, int English14_10, int Math14_10) {
        // 학생을 추가한다.
        People14_10s.add(new People14_10(name, Korean14_10, English14_10, Math14_10));
    }
    // 다형성으로 같은 함수 이름으로 학생 추가 함수, 이름과 국어, 영어, 수학, 선택 과목 성적을 받는다.
    public void addPeople14_10(
        String name,
        int Korean14_10,
        int English14_10,
        int Math14_10,
        int select
    ) {
        // 학생을 추가한다.
        People14_10s.add(new People14_10(name, Korean14_10, English14_10, Math14_10, select));
    }
    // 초기화 함수
    public void init() {
        // 총점과 평균을 구한다.
        for (int i = 0; i < People14_10s.size(); i++) {
            People14_10 People14_10 = People14_10s.get(i);
            People14_10.init();
        }
        // 석차를 구한다.
        for (int i = 0; i < People14_10s.size(); i++) {
            People14_10 People14_10 = People14_10s.get(i);
            People14_10.initRank(People14_10s);
        }
    }
    // 총점과 평균, 석차를 출력하는 함수
    public void print() {
        // 학급의 인원 전부 출력한다.
        for (int i = 0; i < People14_10s.size(); i++) {
            // 학생 취득
            People14_10 People14_10 = People14_10s.get(i);
            // 석차 구하기
            int rank = People14_10.getRank();
            // 콘솔 출력
            System
                .out
                .println(
                    People14_10.getName() + " total = " + People14_10.sum() + ", avg = " + People14_10.avg() + ", " +
                    "ranking = " + rank
                );
        }
    }
}

public class J14_10 {
    // 실행 함수
    public static void main(String ...args) {
        // 학급을 할당한다.
        SchoolClass14_10 SchoolClass14_10 = new SchoolClass14_10();
        // 학생을 임의로 추가한다.
        SchoolClass14_10.addPeople14_10("A", 50, 60, 70);
        SchoolClass14_10.addPeople14_10("B", 70, 20, 50);
        SchoolClass14_10.addPeople14_10("C", 60, 70, 40);
        SchoolClass14_10.addPeople14_10("D", 30, 80, 30);
        SchoolClass14_10.addPeople14_10("E", 50, 100, 50);
        SchoolClass14_10.addPeople14_10("F", 70, 70, 60);
        SchoolClass14_10.addPeople14_10("G", 90, 40, 40);
        SchoolClass14_10.addPeople14_10("H", 100, 100, 90);
        SchoolClass14_10.addPeople14_10("I", 40, 50, 10);
        SchoolClass14_10.addPeople14_10("J", 60, 70, 30);
        // 두 학생은 선택 과목을 추가했다.
        SchoolClass14_10.addPeople14_10("K", 60, 70, 30, 70);
        SchoolClass14_10.addPeople14_10("L", 60, 70, 30, 100);
        // 총점과 평균, 석차를 계산한다.
        SchoolClass14_10.init();
        // 성적을 출력한다.
        SchoolClass14_10.print();
        // 소스가 길어지는 관계로 상위 30%와 하위 30%는 생략함
    }

}
