import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int temp;

        System.out.printf("현재 온도를 입력하세요."); 
        temp = keyboard.nextInt();
        
        if (temp >= 35) {
            System.out.printf("폭염 경보");
        } else if (temp >= 30) {
            System.out.printf("폭염 주의보");
        } else if (temp >= -10) {
            System.out.printf("정상 온도");
        } else {
            System.out.printf("한파 경보");
        }
    }
}