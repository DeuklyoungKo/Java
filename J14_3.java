import java.util.ArrayList;
import java.util.List;
// 학급 클래스
class SchoolClass2_14_3 {
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
    // 총점 취득 함수
    public int sum(int index) {
        // 국어, 영어, 수학 성적을 합친다.
        return this.korean.get(index) + this.english.get(index) + this.math.get(index);
    }
    // 평균 취득 함수
    public int avg(int index) {
        // 총점에서 3을 나눈다.
        return sum(index) / 3;
    }

    // 학급의 석차를 구한다.
    public int getRank(int index) {
        // 1등부터 시작
        int rank = 1;
        // 다른 학생과 비교한다.
        for (int i = 0; i < peoples.size(); i++) {
            // 총점 취득
            int sum = sum(index);
            // 같은 순서이면 같은 학생이므로 넘긴다.
            if (i == index) {
                continue;
            }
            // 다른 학생이 성적이 더 높으면 석차를 내린다.
            if (sum(i) > sum) {
                rank++;
            }
        }
        return rank;
    }
    
    // 총점과 평균, 석차를 출력하는 함수
    public void print() {
        // 학급의 인원 전부 출력한다.
        for (int i = 0; i < peoples.size(); i++) {
            // 석차 구하기
            int rank = getRank(i);
            // 콘솔 출력
            System
                .out
                .println(
                    peoples.get(i) + " total = " + sum(i) + ", avg = " + avg(i) + ", ranking = " +
                    rank
                );
        }
    }
}

public class J14_3 {
    // 실행 함수
    public static void main(String ...args) {
        // 학급을 할당한다.
        SchoolClass2_14_3 schoolclass = new SchoolClass2_14_3();
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
        // 성적을 출력한다.
        schoolclass.print();
    }

}
