package random;

import java.util.Scanner;

public class BuggyCalculator {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        BuggyCalculator buggyCalculator = new BuggyCalculator();
        buggyCalculator.execute();
    }

    void execute()
    {
        int a = getInteger();
        int b = getInteger();

        System.out.println(calculateSumWithoutCarry(a, b));
    }

    int calculateSumWithoutCarry(int a, int b)
    {
        int sum;

        sum = a + b;

        int reminderA = a % 10;
        int reminderB = b % 10;

        int sumOfReminders = reminderA + reminderB;

        if (sumOfReminders < 10)
        {
            return sum;
        }
        else
        {
            while (sumOfReminders >= 10)
            {
                sumOfReminders = sumOfReminders / 10;
            }
            sum = sum - (sumOfReminders * 10);
        }

        return sum;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
