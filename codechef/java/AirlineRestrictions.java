package codechef.java;

import java.util.Scanner;

public class AirlineRestrictions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            if ((a + b <= d && c <= e) || (a + c <= d && b <= e) || (b + c <= d && a <= e)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
