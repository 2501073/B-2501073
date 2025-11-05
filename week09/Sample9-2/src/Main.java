import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int start;
        int last;
        int sum = 0;

        while (true) {
            System.out.printf("어디부터 더할까요?");
            start = keyboard.nextInt();
            System.out.printf("어디까지 더할까요?");
            last = keyboard.nextInt();

            if (start >= last) {
                System.err.println("ERROR : start가 last보다 작아야함");
                System.in.read();
            } else {
                break;
            }
        }

        for (int i = start; i <= last; i++) {
            sum += i;
        }

        System.out.printf("%d+%d+...+%d = %d\n",start, start + 1, last, sum);
    }

    private static class I0Excaption extends Exception {
    }
}