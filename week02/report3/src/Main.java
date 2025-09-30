import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name, address;
        int 가족구성원;
        System.out.printf("당신의 이름을 입력하세요.");
        name = keyboard.next();
        System.out.printf("%s님의 가족은 몇명입니까?\n", name);
        가족구성원 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s님의 가족은 어디에서 살지요?\n", name);
        address = keyboard.nextLine();
        System.out.printf("%s님의 가족은 %d명 입니다.\n", name, 가족구성원);
        System.out.printf("%s님의 가족은 %s에 살고 있습니다.\n", name, address);
    }
}