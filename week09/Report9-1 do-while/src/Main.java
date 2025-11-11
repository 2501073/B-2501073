//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int total = 37;
        int legs = 102;
        int chickens = 0;

        do {
            int dogs = total - chickens;
            if (chickens * 2 + dogs * 4 == legs) {
                System.out.println("닭: " + chickens + "마리");
                System.out.println("개: " + dogs + "마리");
            }
            chickens++;
        } while (chickens <= total);
    }
}