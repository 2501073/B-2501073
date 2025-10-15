//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int radius = 6378137;
        final int Korea = 99720;
        final double PI = 3.141592f;
        double temp;
        long surface;
        double result;

        temp = 4 * PI * radius * radius;
        surface = (long) (temp / 1000);

        result = (double) Korea / surface * 100;

        System.out.printf("지구의 반지름은 %,d m 입니다.\n", radius);
        System.out.printf("지구의 표면적은 %,d \u33A2 입니다.\n", surface);
        System.out.printf("대한민국의 넓이는 %,d \u33A2 입니다.\n", Korea);
        System.out.printf("대한민국은 지구의 %.8f %%입니다\n", result);
    }
}