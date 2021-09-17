package codechef.java;

import java.util.Scanner;

public class TwoTen {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        TwoTen twoTen = new TwoTen();
        twoTen.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int x = getInteger();
            System.out.println(findSmallestNumberToWinGame(x));
        }
    }

    int findSmallestNumberToWinGame(int number)
    {
        if (number % 5 == 0)
        {
            if (number % 10 == 0)
                return 0;
            else
                return 1;
        }
        else
                return -1;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
