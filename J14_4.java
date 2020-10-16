import java.util.ArrayList;
import java.util.List;
// 국어 클래스
class Korean14_4 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public Korean14_4(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 영어 클래스
class English14_4 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public English14_4(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 수학 클래스
class Math14_4 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public Math14_4(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 학생 클래스
class People14_4 {
    // 이름
    private String name;
    // 국어 성적
    private Korean14_4 Korean14_4;
    // 영어 성적
    private English14_4 English14_4;
    // 수학 성적
    private Math14_4 Math14_4;
    // 생성자로 이름과 점수를 받는다.
    public People14_4(String name, int Korean14_4, int English14_4, int Math14_4) {
        this.name = name;
        this.Korean14_4 = new Korean14_4(Korean14_4);
        this.English14_4 = new English14_4(English14_4);
        this.Math14_4 = new Math14_4(Math14_4);
    }
    // 이름 취득 함수
    public String getName() {
        return this.name;
    }
    // 총점 취득 함수
    public int sum() {
        // 국어, 영어, 수학 성적을 합친다.
        return this.Korean14_4.getScore() + this.English14_4.getScore() + this.Math14_4.getScore();
    }
    // 평균 취득 함수
    public int avg() {
        // 총점에서 3을 나눈다.
        return sum() / 3;
    }
}
// 학급 클래스
class SchoolClass14_4 {
    // 학급 인원 리스트
    private final List<People14_4> People14_4s = new ArrayList<>();
    // 학생 추가 함수, 이름과 국어, 영어, 수학 성적을 받는다.
    public void addPeople14_4(String name, int Korean14_4, int English14_4, int Math14_4) {
        // 학생을 추가한다.
        People14_4s.add(new People14_4(name, Korean14_4, English14_4, Math14_4));
    }
    // 학급의 석차를 구한다.
    public int getRank(People14_4 People14_4) {
        // 1등부터 시작
        int rank = 1;
        // 다른 학생과 비교한다.
        for (int i = 0; i < People14_4s.size(); i++) {
            // 다른 학생 취득
            People14_4 other = People14_4s.get(i);
            // 본인 비교는 넘긴다.
            if (other == People14_4) {
                continue;
            }
            // 다른 학생이 성적이 더 높으면 석차를 내린다.
            if (other.sum() > People14_4.sum()) {
                rank++;
            }
        }
        return rank;
    }
    // 총점과 평균, 석차를 출력하는 함수
    public void print() {
        // 학급의 인원 전부 출력한다.
        for (int i = 0; i < People14_4s.size(); i++) {
            // 학생 취득
            People14_4 People14_4 = People14_4s.get(i);
            // 석차 구하기
            int rank = getRank(People14_4);
            // 콘솔 출력
            System
                .out
                .println(
                    People14_4.getName() + " total = " + People14_4.sum() + ", avg = " + People14_4.avg() + ", " +
                    "ranking = " + rank
                );
        }
    }
}

public class J14_4 {
    // 실행 함수
    public static void main(String ...args) {
        // 학급을 할당한다.
        SchoolClass14_4 SchoolClass14_4 = new SchoolClass14_4();
        // 학생을 임의로 추가한다.
        SchoolClass14_4.addPeople14_4("A", 50, 60, 70);
        SchoolClass14_4.addPeople14_4("B", 70, 20, 50);
        SchoolClass14_4.addPeople14_4("C", 60, 70, 40);
        SchoolClass14_4.addPeople14_4("D", 30, 80, 30);
        SchoolClass14_4.addPeople14_4("E", 50, 100, 50);
        SchoolClass14_4.addPeople14_4("F", 70, 70, 60);
        SchoolClass14_4.addPeople14_4("G", 90, 40, 40);
        SchoolClass14_4.addPeople14_4("H", 100, 100, 90);
        SchoolClass14_4.addPeople14_4("I", 40, 50, 10);
        SchoolClass14_4.addPeople14_4("J", 60, 70, 30);
        // 성적을 출력한다.
        SchoolClass14_4.print();
    }

}
