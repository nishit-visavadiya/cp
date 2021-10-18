package codechef.java;

import java.util.Scanner;

public class PuppyAndSum {

    Scanner sc = new Scanner(System.in);

    int dTime, numbersToSum, sum = 0;

    public static void main(String[] args)
    {
        PuppyAndSum puppyAndSum = new PuppyAndSum();
        puppyAndSum.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            sum = 0;

            dTime = getInteger();
            numbersToSum = getInteger();

            System.out.println(calculateSumOfIntegers());
        }
    }

    int calculateSumOfIntegers()
    {
        while (dIsNotZero())
        {
            sum = sumOfNNumbers();
            numbersToSum = sum;
            dTime--;
        }
        return sum;
    }

    int sumOfNNumbers()
    {
        return (numbersToSum * (numbersToSum + 1)) / 2;
    }

    boolean dIsNotZero()
    {
        return dTime > 0;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
