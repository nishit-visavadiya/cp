package codechef.java;

import java.util.Scanner;

public class IplAndRcb {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        IplAndRcb iplAndRcb = new IplAndRcb();
        iplAndRcb.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int point = getInteger();
            int totalMatches = getInteger();

            System.out.println(minimumNumberOfMatchesToWin(point, totalMatches));
        }
    }

    int minimumNumberOfMatchesToWin(int point, int totalMatches)
    {
        if (point > totalMatches)
            return point - totalMatches;

        return 0;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
