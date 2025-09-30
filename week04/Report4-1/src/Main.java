import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pyeong;
        int price;
        System.out.print("평수를 입력하세요:");
        pyeong = keyboard.nextInt();
        price = pyeong * 56000;

        price = (price / 1000) * 1000;

        System.out.println("주택지 가격:" + price + "원");
    }
}