import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;
        System.out.println("당신의 이름은?");
        name = keyboard.nextLine();
        System.out.println("%s님의 나이는?");
        age = keyboard.nextLine();

        System.out.printf("XXX님의 나이는 YY살 입니다.\n, name, age");
    }