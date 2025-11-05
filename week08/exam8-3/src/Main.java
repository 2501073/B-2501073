import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a;
        double b;
        double c = 3.141592;
        double d;

        System.out.printf("반지름 입력 :");
        a = keyboard.nextInt();

        b = 4 / 3 * c * a * a * a;
        d = 4 * c * a * a;

        System.out.printf("구의 부피는 %.2f\n", b);
        System.out.printf("구의 표면적은 %.2f\n", d);
    }
}