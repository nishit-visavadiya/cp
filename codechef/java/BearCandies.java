package codechef.java;

import java.util.Scanner;

public class BearCandies {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        BearCandies bearCandies = new BearCandies();
        bearCandies.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int limak = getInteger();
            int bob = getInteger();

            System.out.println(whoCanEatMaximumCandy(limak, bob));
        }
    }

    String whoCanEatMaximumCandy(int limak, int bob)
    {
        String result = "";

        for (int i = 1; i <= 1000; i++)
        {
            if (i % 2 == 1)
            {
                limak = limak - i;
                if (limak < 0)
                {
                    result = "Bob";
                    break;
                }
            }
            else
            {
                bob = bob - i;
                if (bob < 0)
                {
                    result = "Limak";
                    break;
                }
            }
        }
        return result;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
