package codechef.java;

import java.util.Scanner;

public class RangeOdd {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        for (int i = left; i <= right; i++)
        {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
