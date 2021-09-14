package codechef.java;

import java.util.Scanner;

public class PuppyAndSum {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases > 0)
        {
            int sum = 0;
            int d = sc.nextInt();
            int n = sc.nextInt();

            while (d != 0)
            {
                sum = (n * (n + 1)) / 2;
                n = sum;
                d--;
            }
            System.out.println(sum);
            testCases--;
        }
    }
}
