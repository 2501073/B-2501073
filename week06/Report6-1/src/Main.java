import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int piece;
        int discount = 0;

        System.out.printf("식권 구매 개수 :");

        piece = keyboard.nextInt();

        if (piece >= 30) {
            discount = 20;
        } else if (piece >= 20) {
            discount = 15;
        } else if (piece >= 10) {
            discount = 10;
        } else {
            discount = 0;
        }

        System.out.printf("식권 구매 개수는 %d개 할인율은 %d%%\n", piece, discount);
    }
}