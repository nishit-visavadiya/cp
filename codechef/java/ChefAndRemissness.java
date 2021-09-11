package codechef.java;

import java.util.Scanner;

public class ChefAndRemissness {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases --> 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum;

            if (a > b)
                System.out.print(a + " ");
            else
                System.out.println(b + " ");

            sum = a + b;
            System.out.println(sum);
        }
    }

}
