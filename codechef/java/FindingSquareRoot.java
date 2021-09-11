package codechef.java;

import java.util.Scanner;

public class FindingSquareRoot {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases --> 0)
        {
            int num = sc.nextInt();
            int squareRoot = (int) Math.sqrt(num);
            System.out.println(squareRoot);
        }
    }

}
