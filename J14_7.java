import java.util.ArrayList;
import java.util.List;
// 국어 클래스
class Korean14_7 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public Korean14_7(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 영어 클래스
class English14_7 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public English14_7(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 수학 클래스
class Math14_7 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public Math14_7(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 학생 클래스
class People14_7 {
    // 이름
    private String name;
    // 국어 성적
    private Korean14_7 Korean14_7;
    // 영어 성적
    private English14_7 English14_7;
    // 수학 성적
    private Math14_7 Math14_7;
    // 총점
    private int sum;
    // 평균
    private int avg;
    // 석차
    private int rank;
    // 생성자로 이름과 점수를 받는다.
    public People14_7(String name, int Korean14_7, int English14_7, int Math14_7) {
        this.name = name;
        this.Korean14_7 = new Korean14_7(Korean14_7);
        this.English14_7 = new English14_7(English14_7);
        this.Math14_7 = new Math14_7(Math14_7);
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
        this.sum = this
            .Korean14_7
            .getScore() + this
            .English14_7
            .getScore() + this
            .Math14_7
            .getScore();
        // 총점에서 3을 나눈다.
        this.avg = this.sum / 3;
    }
    // 석차를 계산한다.
    public void initRank(List<People14_7> People14_7s) {
        // 1등부터 시작
        int rank = 1;
        // 다른 학생과 비교한다.
        for (int i = 0; i < People14_7s.size(); i++) {
            // 다른 학생 취득
            People14_7 other = People14_7s.get(i);
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
class SchoolClass14_7 {
    // 학급 인원 리스트
    private final List<People14_7> People14_7s = new ArrayList<>();
    // 학생 추가 함수, 이름과 국어, 영어, 수학 성적을 받는다.
    public void addPeople14_7(String name, int Korean14_7, int English14_7, int Math14_7) {
        // 학생을 추가한다.
        People14_7s.add(new People14_7(name, Korean14_7, English14_7, Math14_7));
    }
    // 초기화 함수
    public void init() {
        // 총점과 평균을 구한다.
        for (int i = 0; i < People14_7s.size(); i++) {
            People14_7 People14_7 = People14_7s.get(i);
            People14_7.init();
        }
        // 석차를 구한다.
        for (int i = 0; i < People14_7s.size(); i++) {
            People14_7 People14_7 = People14_7s.get(i);
            People14_7.initRank(People14_7s);
        }
    }
    // 총점과 평균, 석차를 출력하는 함수
    public void print() {
        // 학급의 인원 전부 출력한다.
        for (int i = 0; i < People14_7s.size(); i++) {
            // 학생 취득
            People14_7 People14_7 = People14_7s.get(i);
            // 석차 구하기
            int rank = People14_7.getRank();
            // 콘솔 출력
            System
                .out
                .println(
                    People14_7.getName() + " total = " + People14_7.sum() + ", avg = " + People14_7.avg() + ", " +
                    "ranking = " + rank
                );
        }
    }
    // 상위 30%와 하위 30%를 구하는 함수
    public void print2() {
        // 성적 순으로 재분류하기 위한 소트 변수
        List<People14_7> sort = new ArrayList<>();
        // 순위별 루프 소트 알고리즘이 있는데, 이해하기 편하게 순위 별로 소트합니다.
        for (int i = 0; i < People14_7s.size(); i++) {
            // 학급 학생 취득
            for (int j = 0; j < People14_7s.size(); j++) {
                // 학생 취득
                People14_7 People14_7 = People14_7s.get(j);
                // 순위가 i+1, 즉 0일 때 1
                if (People14_7.getRank() == i + 1) {
                    // 순위 별로 재정렬
                    sort.add(People14_7);
                }
            }
        }
        // 30%의 해당하는 카운트
        int count = sort.size() / 3;
        // 상위 30% 출력
        for (int i = 0; i < count; i++) {
            // 콘솔 출력
            System
                .out
                .println("Top " + (
                    i + 1
                ) + " - " + sort.get(i).getName());
        }
        // 개행 출력
        System
            .out
            .println();
        // 하위 30% 출력
        for (int i = sort.size() - 1; i >= sort.size() - count; i--) {
            System
                .out
                .println("Sub " + (
                    i + 1
                ) + " - " + sort.get(i).getName());
        }
    }
}

public class J14_7 {
    // 실행 함수
    public static void main(String ...args) {
        // 학급을 할당한다.
        SchoolClass14_7 SchoolClass14_7 = new SchoolClass14_7();
        // 학생을 임의로 추가한다.
        SchoolClass14_7.addPeople14_7("A", 50, 60, 70);
        SchoolClass14_7.addPeople14_7("B", 70, 20, 50);
        SchoolClass14_7.addPeople14_7("C", 60, 70, 40);
        SchoolClass14_7.addPeople14_7("D", 30, 80, 30);
        SchoolClass14_7.addPeople14_7("E", 50, 100, 50);
        SchoolClass14_7.addPeople14_7("F", 70, 70, 60);
        SchoolClass14_7.addPeople14_7("G", 90, 40, 40);
        SchoolClass14_7.addPeople14_7("H", 100, 100, 90);
        SchoolClass14_7.addPeople14_7("I", 40, 50, 10);
        SchoolClass14_7.addPeople14_7("J", 60, 70, 30);
        // 총점과 평균, 석차를 계산한다.
        SchoolClass14_7.init();
        // 성적을 출력한다.
        SchoolClass14_7.print();
        // 개행
        System
            .out
            .println();
        // 상위 30%와 하위 30%를 구한다.
        SchoolClass14_7.print2();
    }

}
