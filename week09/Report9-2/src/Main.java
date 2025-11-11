//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int saveCoins = 10;
        int coin500 = 500;
        int coin100 = 100;
        int months = 12;
        int years = 30;

        int amount = ((saveCoins * coin500) + (saveCoins * coin100)) * months *years;
        System.out.println("총 저금액:"+ amount + "원");
    }
}