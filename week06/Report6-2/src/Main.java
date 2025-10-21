import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double oil;
        double money;
        double total;

        System.out.printf("주유할 리터 수 :");
        oil = keyboard.nextDouble();
        System.out.printf("리터당 가격 :");
        money = keyboard.nextDouble();

        total= oil * money;

        if (total >= 50000) {
            total = (total * 0.93);
        }

        total = total * 1.1;

        System.out.printf("최종 결제 금액은 %.2f만원 이다.\n", total);
    }
}