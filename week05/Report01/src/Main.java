import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char ch;
        char convert;

        System.out.printf("문자 1개 입력:");

        ch = keyboard.next().charAt(0);

        if ('a' <= ch && ch <= 'z') {
            convert = (char) (ch - 32);
            System.out.printf("입력문자 %c는 소문자이고, 대문자로 변경하면 %c입니다.\n", ch, convert);
        } else if ('A' <= ch && ch <= 'z') {
            convert = (char) (ch + 32);
            System.out.printf("입력문자 %c는 대문자이고, 소문자로 변경하면 %c입니다.\n", ch, convert);
        } else {
            System.out.printf("영문자가 아닙니다.");
        }
    }
}