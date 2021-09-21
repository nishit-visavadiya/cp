package codechef.java;

import java.util.Scanner;

public class ChefAndDigits {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndDigits chefAndDigits = new ChefAndDigits();
        chefAndDigits.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            String s = getString();

            if (isDigitsEqual(s))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    boolean isDigitsEqual(String s)
    {
        int a = 0, b = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '0')
                a++;
            else
                b++;
        }

        return a == 1 || b == 1;
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
