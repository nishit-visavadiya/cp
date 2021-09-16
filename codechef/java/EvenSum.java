package codechef.java;

import java.util.Scanner;

public class EvenSum {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        EvenSum evenSum = new EvenSum();
        evenSum.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int n = getInteger();
            System.out.println(getEvenSum(n));
        }
    }

    int getEvenSum(int numberOfElements)
    {
        int originalSum = 0;

        for (int i = 0; i < numberOfElements; i++)
        {
            int element = getInteger();
            originalSum += element;
        }
        if (originalSum % 2 == 0)
            return 1;
        else
            return 2;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
