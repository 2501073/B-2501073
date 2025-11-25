//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int BASIC_FEE = 1200;

        String[] no = new String[10];
        String[] name = new String[10];
        int[] code = new int[10];
        double[] usage = new double[10];

        int count = 0;

        while (count < 10) {
            System.out.println((count + 1) + "번째 고객 정보 입력");

            System.out.print("번호(4자리): ");
            no[count] = keyboard.next();

            System.out.print("이름: ");
            name[count] = keyboard.next();

            System.out.print("구분코드(1~5): ");
            code[count] = keyboard.nextInt();

            if (code[count] < 1 || code[count] > 5) {
                System.out.println("잘못된 코드입니다. 다시 입력하세요.\n");
                continue;
            }

            System.out.print("사용량(m3): ");
            usage[count] = keyboard.nextDouble();

            count++;
        }

        System.out.println("===============================================================");
        System.out.println("                         수   도   요   금");
        System.out.println("===============================================================");
        System.out.printf("%-6s %-6s %-6s %-8s %-10s %-10s %-10s %-8s\n",
                "번호", "이름", "구분", "사용량", "사용금액", "TAX", "납부액", "비고");
        System.out.println("---------------------------------------------------------------");

        int i = 0;
        while (i < count) {

            String type = "";
            int unit = 0;
            double taxRate = 0;

            if (code[i] == 1) { type = "가정용"; unit = 40; taxRate = 5.0; }
            else if (code[i] == 2) { type = "영업용"; unit = 55; taxRate = 3.5; }
            else if (code[i] == 3) { type = "공장용"; unit = 78; taxRate = 2.5; }
            else if (code[i] == 4) { type = "관공서"; unit = 35; taxRate = 1.5; }
            else if (code[i] == 5) { type = "군기관"; unit = 20; taxRate = 0; }

            long roundedUsage = Math.round(usage[i]);
            long useAmount = roundedUsage * unit;

            long tax = (long) ((BASIC_FEE + useAmount) * taxRate / 100);
            tax = (tax / 10) * 10;   // 1의 자리 절사

            long total = BASIC_FEE + useAmount + tax;

            String remark = "";
            if (code[i] == 5) remark = "일괄징수";

            System.out.printf("%-6s %-6s %-8s %-8.1f %-10d %-10d %-10d %-8s\n",
                    no[i], name[i], type, usage[i],
                    useAmount, tax, total, remark);

            i++;
        }

        System.out.println("---------------------------------------------------------------");
    }
}
