package codechef.java;

import java.util.Scanner;

public class ChefInHeaven {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefInHeaven chefInHeaven = new ChefInHeaven();
        chefInHeaven.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int years = getInteger();
            String s = getString();

            if (isChefCanGoHeaven(years, s))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }

    boolean isChefCanGoHeaven(int years, String s)
    {
        int good = 0, bad = 0;

        for (int i = 0; i < years; i++)
        {
            if (s.charAt(i) == '1')
                good++;

            if (s.charAt(i) == '0')
                bad++;

            if (good >= bad)
                return true;
        }

        return false;
    }

    String getString()
    {
        return sc.next();
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
