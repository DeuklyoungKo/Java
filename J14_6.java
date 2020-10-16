import java.util.ArrayList;
import java.util.List;
// 국어 클래스
class Korean14_6 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public Korean14_6(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 영어 클래스
class English14_6 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public English14_6(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 수학 클래스
class Math14_6 {
    // 점수
    private int score;
    // 생성자로 점수를 받는다.
    public Math14_6(int score) {
        this.score = score;
    }
    // 점수 취득 함수
    public int getScore() {
        return this.score;
    }
}
// 학생 클래스
class People14_6 {
    // 이름
    private String name;
    // 국어 성적
    private Korean14_6 Korean14_6;
    // 영어 성적
    private English14_6 English14_6;
    // 수학 성적
    private Math14_6 Math14_6;
    // 생성자로 이름과 점수를 받는다.
    public People14_6(String name, int Korean14_6, int English14_6, int Math14_6) {
        this.name = name;
        this.Korean14_6 = new Korean14_6(Korean14_6);
        this.English14_6 = new English14_6(English14_6);
        this.Math14_6 = new Math14_6(Math14_6);
    }
    // 이름 취득 함수
    public String getName() {
        return this.name;
    }
    // 총점 취득 함수
    public int sum() {
        // 국어, 영어, 수학 성적을 합친다.
        return this
            .Korean14_6
            .getScore() + this
            .English14_6
            .getScore() + this
            .Math14_6
            .getScore();
    }
    // 평균 취득 함수
    public int avg() {
        // 총점에서 3을 나눈다.
        return sum() / 3;
    }
}
// 학급 클래스
class SchoolClass14_6 {
    // 학급 인원 리스트
    private final List<People14_6> People14_6s = new ArrayList<>();
    // 학생 추가 함수, 이름과 국어, 영어, 수학 성적을 받는다.
    public void addPeople14_6(String name, int Korean14_6, int English14_6, int Math14_6) {
        // 학생을 추가한다.
        People14_6s.add(new People14_6(name, Korean14_6, English14_6, Math14_6));
    }
    // 학급의 석차를 구한다.
    public int getRank(People14_6 People14_6) {
        // 1등부터 시작
        int rank = 1;
        // 다른 학생과 비교한다.
        for (int i = 0; i < People14_6s.size(); i++) {
            // 다른 학생 취득
            People14_6 other = People14_6s.get(i);
            // 본인 비교는 넘긴다.
            if (other == People14_6) {
                continue;
            }
            // 다른 학생이 성적이 더 높으면 석차를 내린다.
            if (other.sum() > People14_6.sum()) {
                rank++;
            }
        }
        return rank;
    }
    // 총점과 평균, 석차를 출력하는 함수
    public void print() {
        // 학급의 인원 전부 출력한다.
        for (int i = 0; i < People14_6s.size(); i++) {
            // 학생 취득
            People14_6 People14_6 = People14_6s.get(i);
            // 석차 구하기
            int rank = getRank(People14_6);
            // 콘솔 출력
            System
                .out
                .println(
                    People14_6.getName() + " total = " + People14_6.sum() + ", avg = " + People14_6.avg() + ", " +
                    "ranking = " + rank
                );
        }
    }
    // 상위 30%와 하위 30%를 구하는 함수
    public void print2() {
        // 성적 순으로 재분류하기 위한 소트 변수
        List<People14_6> sort = new ArrayList<>();
        // 순위별 루프 소트 알고리즘이 있는데, 이해하기 편하게 순위 별로 소트합니다.
        for (int i = 0; i < People14_6s.size(); i++) {
            // 학급 학생 취득
            for (int j = 0; j < People14_6s.size(); j++) {
                // 학생 취득
                People14_6 People14_6 = People14_6s.get(j);
                // 순위가 i+1, 즉 0일 때 1
                if (getRank(People14_6) == i + 1) {
                    // 순위 별로 재정렬
                    sort.add(People14_6);
                }
            }
        }
        // 30%의 해당하는 카운트
        int count = sort.size() / 3;
        // 상위 30% 출력
        for (int i = 0; i < count; i++) {
            // 콘솔 출력
            System.out.println("Top " + ( i + 1 ) + " - " + sort.get(i).getName());
        }
        // 개행 출력
        System.out.println();
        // 하위 30% 출력
        for (int i = sort.size() - 1; i >= sort.size() - count; i--) {
            System.out.println("Sub " + ( i + 1 ) + " - " + sort.get(i).getName());
        }
    }
}

public class J14_6 {
    // 실행 함수
    public static void main(String ...args) {
        // 학급을 할당한다.
        SchoolClass14_6 SchoolClass14_6 = new SchoolClass14_6();
        // 학생을 임의로 추가한다.
        SchoolClass14_6.addPeople14_6("A", 50, 60, 70);
        SchoolClass14_6.addPeople14_6("B", 70, 20, 50);
        SchoolClass14_6.addPeople14_6("C", 60, 70, 40);
        SchoolClass14_6.addPeople14_6("D", 30, 80, 30);
        SchoolClass14_6.addPeople14_6("E", 50, 100, 50);
        SchoolClass14_6.addPeople14_6("F", 70, 70, 60);
        SchoolClass14_6.addPeople14_6("G", 90, 40, 40);
        SchoolClass14_6.addPeople14_6("H", 100, 100, 90);
        SchoolClass14_6.addPeople14_6("I", 40, 50, 10);
        SchoolClass14_6.addPeople14_6("J", 60, 70, 30);
        // 성적을 출력한다.
        SchoolClass14_6.print();
        // 개행
        System
            .out
            .println();
        // 상위 30%와 하위 30%를 구한다.
        SchoolClass14_6.print2();
    }

}
