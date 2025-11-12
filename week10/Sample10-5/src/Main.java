import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] name = new String[] {"홍길동", "이재명", "윤석열", "경복대", "오세훈", "강민성", "김진성", "니키타", "김정은", "김시온"};
        String[] hakbun = {"2501001", "2501002", "2501003", "2501004", "2501006", "2501007", "2501008", "2501009", "2501010"};
        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] total = new int[name.length];
        int[] rank = new int[name.length];
        float[] avg = new float[name.length];

        int i = 0;
        while (i < name.length) {
            System.out.printf("%s 학생의 국어 성적 입력 :", name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 영어 성적 입력 :", name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 수학 성적 입력 :", name[i]);
            math[i] = keyboard.nextInt();

            if (kor[i] >= 0 && kor[i] <= 100) &&
                    (eng [i] >= 0 && kor[i] <= 100) &&
                            (math[i] >= 0 && kor[i] <= 100)
        }
    }
}