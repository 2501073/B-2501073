import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static int[][] inputData(String[] name) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int[] data = new int[name.length][4];
        String[] subject = {"국어","영어","수학"};


        int i = 0;
        while (i < data.length) {
            for (int j = 0; )
                readData(i, data[i][j]);
                if (data[i][0] >= 0 && data[i][0] <= 100 &&
                        data[i][1] >= 0 && data[i][1] <= 100 &&
                        data[i][2] >= 0 && data[i][2] <= 100 )
                    i++;
                else {
                    System.out.println("Error");
                    System.in.read();
            }
        return data;
            System.out.printf("%s님의 성적 입력:", name[i]);
            data[i][0] = keyboard.nextInt();
            if (data[i][0] >= 0 && data[i][0] <= 100)
                i++;
            else {
                System.out.println("Error:");
                System.in.read();
            }
        }

        return data;
    }
}
