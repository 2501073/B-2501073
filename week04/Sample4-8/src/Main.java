import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            int total, tax, income;
            int bonbong;
            int bonus;
            total = bonbong + bonus;

            System.out.printf("본봉 입력 :");
            bonbong = keyboard.nextInt();

            System.out.printf("보너스 입력 :");
            bonus = keyboard.nextInt();


            tax = (int) (total * (8.0 / 100));
            tax /= 100;
            tax *= 100;
            income = total - tax;

            System.out.printf("홍 길동의 총 수입액 : %,d 원\n", total);
            System.out.printf("홍 길동의 세금 : %,d 원\n", tax);
            System.out.printf("홍 길동의 실 수입액 : %,d 원\n", income);
    }
}