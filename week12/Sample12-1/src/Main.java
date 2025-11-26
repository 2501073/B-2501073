import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int first, second;
        int result;

        first = readData();
        second = readData();
        result = readData();
        display = readData();

        /*System.out.print("첫번째 정수 입력:");
        first = keyboard.nextInt();
        System.out.print("두번째 정수 입력:");
        second = keyboard.nextInt();*/

        //result = first + second;
        result = add(first, second);
        display(first, second, result);

        //System.out.printf("%d + %d = %d\n", first, second, result);
    }

    private static void display(int first, int second, int result) {
        System.out.printf("%d + %d = %d\n", first, second, result);
    }

    private static int add(int first, int second) {
        int result;
        result = first + second;
        return result;
    }

    private static int readData(String) {
        Scanner keyboard = new Scanner(System.in);
        int temp;
        System.out.print();
        temp = keyboard.nextInt();
        return temp;
    }
}