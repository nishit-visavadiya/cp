package codechef.java;

import java.util.Scanner;

public class TwoNumbers {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        TwoNumbers twoNumbers = new TwoNumbers();
        twoNumbers.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int a = getInteger();
            int b = getInteger();
            int n = getInteger();

            System.out.println(calculateMaximumAndMinimum(a, b, n));
        }
    }

    int calculateMaximumAndMinimum(int a, int b, int n)
    {
        return n % 2 == 1 ? Math.max(2 * a, b) / Math.min(2 * a, b) : Math.max(a, b) /Math.min(a, b);
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
