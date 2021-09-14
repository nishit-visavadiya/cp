package codechef.java;

import java.util.Scanner;

public class TotalExpenses {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases -- > 0)
        {
            int q = sc.nextInt();
            int p = sc.nextInt();
            long x = q * p;

            if (q <= 1000)
                System.out.println((double)x);
            else
                System.out.format("%6f\n", (x-(0.1) * x));
        }
    }

}
