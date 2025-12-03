public class Compute {
    public static void pay(int[] money, String[] customer, float v) {
        int used = (int) (v + 0.5f);
        if (customer[2].equals("1")) {
            money[0] = used * 40;
        } else if (customer[2].equals("2")) {
            money[0] = used * 55;
        } else if (customer[2].equals("3")) {
            money[0] = used * 78;
        } else if (customer[2].equals("4")) {
            money[0] = used * 35;
        } else if (customer[2].equals("5")) {
            money[0] = used * 20;
        } else {
            money[0] = used * 0;
        }
    }

    public static void tax(String[][] customers, int[][] money) {
        for
    }
}
