package codechef.java;

import java.util.Scanner;

public class SumOrDifference {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
        {
            System.out.print(a - b);
        }
        else
        {
            System.out.print(a + b);
        }
    }

}
