package codechef.java;

import java.util.Scanner;

public class LazyJam {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        LazyJam lazyJam = new LazyJam();
        lazyJam.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getIntegerValue();

        while (testCases --> 0)
        {
            long numberOfProblems = getLongValue();
            long breakMinutes = getLongValue();
            long minutesToSolveProblem = getLongValue();

            System.out.println(calculateTheTimeToCompleteAssignment(numberOfProblems, breakMinutes, minutesToSolveProblem));
        }
    }

    long calculateTheTimeToCompleteAssignment(long numberOfProblems, long breakMinutes, long minutesToSolveProblem)
    {
        long sum = 0;
        long num1;

        while (numberOfProblems > 0)
        {
            if (numberOfProblems % 2 == 0)
                num1 = numberOfProblems / 2;
            else
                num1 = (numberOfProblems + 1) / 2;

            sum += num1 * minutesToSolveProblem;

            minutesToSolveProblem = 2 * minutesToSolveProblem;

            numberOfProblems = numberOfProblems - num1;

            if (numberOfProblems > 0)
                sum += breakMinutes;

        }
        return sum;
    }

    int getIntegerValue()
    {
        return sc.nextInt();
    }

    long getLongValue()
    {
        return sc.nextLong();
    }
}
