package codechef.java;

import java.util.Scanner;

public class LuckyFour {

    Scanner sc = new Scanner(System.in);

    int number, reminder, count = 0;

    public static void main(String[] args)
    {
        LuckyFour luckyFour = new LuckyFour();
        luckyFour.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            number = getInteger();

            System.out.println(numberOfTimeNumberFourAppear());
        }
    }

    int numberOfTimeNumberFourAppear()
    {
        count = 0;
        while (numberIsGreaterThanZero())
        {
            reminder = getLastDigitOfNumber();

            if (countReminderIfItIsFour(reminder))
            {
                count++;
            }
            number = removeOneDigitOfNumber();
        }

        return count;
    }

    boolean countReminderIfItIsFour(int n)
    {
        return n == 4;
    }

    int getLastDigitOfNumber()
    {
        return number % 10;
    }

    int removeOneDigitOfNumber()
    {
        return number /= 10;
    }

    boolean numberIsGreaterThanZero()
    {
        return number > 0;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
