package codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger f = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                f = f.multiply(BigInteger.valueOf(i));
            }
            System.out.println(f);
        }
        sc.close();
    }
}
