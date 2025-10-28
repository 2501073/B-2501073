import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int kor;
        int eng;
        int math;

        System.out.printf("국어 점수 입력 :");
        kor = keyboard.nextInt();
        System.out.printf("영어 점수 입력 :");
        eng = keyboard.nextInt();
        System.out.printf("수학 점수 입력 :");
        math = keyboard.nextInt();

        double avg = (kor + eng + math) / 3.0;
        String result;

        if (avg >= 80) {
            result = "성적 양호";
        } else if (avg >= 60) {
            result = "노력";
        } else {
            result = "성적 불량";
        }

        System.out.printf("국어, 영어, 수학 점수는?\n", kor, eng, math);
        System.out.printf("평균은 %.2f 결과는 %s\n", avg, result);
    }
}