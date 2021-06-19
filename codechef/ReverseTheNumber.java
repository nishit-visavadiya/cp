package codechef;

import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] main) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        for (int j = 0; j < i; j++) {
            int y = 0;
            int x = sc.nextInt();
            while (x != 0) {
                int r = x % 10;
                y = y * 10 + r;
                x /= 10;
            }
            System.out.println(y);
        }
    }
}
