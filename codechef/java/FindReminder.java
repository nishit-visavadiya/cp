package codechef.java;

import java.util.Scanner;

public class FindReminder {

    Scanner scanner = new Scanner(System.in);

    int a, b;

    public static void main(String[] args)
    {
        FindReminder findReminder = new FindReminder();
        findReminder.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            a = getInteger();
            b = getInteger();
            System.out.println(getReminderOfAB());
        }
    }

    int getReminderOfAB()
    {
        return a % b;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
