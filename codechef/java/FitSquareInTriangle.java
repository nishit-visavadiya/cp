package codechef.java;

import java.util.Scanner;

public class FitSquareInTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        int b;

        while (testCases-- > 0) {
            b = sc.nextInt();
            b -= 2;
            b /= 2;
            b = b * (b + 1) / 2;
            System.out.println(b);
        }
    }
}
