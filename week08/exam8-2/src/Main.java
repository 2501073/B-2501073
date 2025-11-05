import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;

        System.out.printf("지출액 입력 :");
        a = keyboard.nextDouble();
        System.out.printf("저축액 입력 :");
        b = keyboard.nextDouble();

        c = a - b;

        d = (c / a) * 100;

        String e;
        if (d <= 30) {
            e = ("상류층");
        } else if (d <= 50) {
            e = ("중산층");
        } else {
            e = ("하류층");
        }
        System.out.printf("엥겔 지수 : %.2f%%\n", d);
        System.out.printf("사회 등급 : " + e);
    }
}