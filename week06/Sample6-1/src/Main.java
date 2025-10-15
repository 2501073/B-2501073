//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int Korea = 99720;
        final int NorthKorea = 122762;
        final int USA = 9631418;
        final int Japan = 377873;

        float temp1 = (float) NorthKorea / Korea;
        float temp2 = (float) USA / Korea;
        float temp3 = (float) Japan / Korea;



        System.out.printf("대한민국의 면적 : %,d km\n", Korea);
        System.out.printf("북한의 면적 : %,d km\n", NorthKorea);
        System.out.printf("미국의 면적 : %,d km\n", USA);
        System.out.printf("일본의 면적 : %,d km\n", Japan);

        System.out.printf("북한은 우리나라에 비해 %.2f 배임\n", temp1);
        System.out.printf("미국은 우리나라에 비해 %.2f 배임\n", temp2);
        System.out.printf("일본은 우리나라에 비해 %.2f 배임\n", temp3);
    }
}