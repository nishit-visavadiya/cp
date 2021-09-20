package codechef.java;

import java.util.Scanner;

public class ChefAndString {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndString cS = new ChefAndString();
        cS.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            String s1 = getString();
            String s2 = getString();

            System.out.println(calculateMinimumAndMaximumDifference(s1, s2));
        }
    }

    String calculateMinimumAndMaximumDifference(String s1, String s2)
    {
        int minimum = 0, maximum = 0;

        for (int i = 0; i < s1.length(); i++)
        {
            if (s1.charAt(i) == '?' || s2.charAt(i) == '?')
            {
                maximum++;
            }
            if (s1.charAt(i) != '?' && s2.charAt(i) != '?' && s1.charAt(i) != s2.charAt(i))
            {
                maximum++;
                minimum++;
            }
        }

        return minimum + " " + maximum;
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
