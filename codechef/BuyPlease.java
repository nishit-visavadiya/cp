package codechef;

import java.util.Scanner;

public class BuyPlease {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum1 = a * b;
        int sum2 = c * d;

        System.out.println(sum1 + sum2);
    }

}
