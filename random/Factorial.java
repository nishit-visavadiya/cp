package random;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] main) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Factorial of " + a + " is " + fact(a));
    }

    public static int fact(int n) {
        int f = 1;
        if (n == 0)
            return 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
