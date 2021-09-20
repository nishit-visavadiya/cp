package codechef.java;

import java.util.Scanner;

public class ChefAndWildcard {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ChefAndWildcard chefAndWildcard = new ChefAndWildcard();
        chefAndWildcard.execute();
    }

    void execute() {
        int testCases = getInteger();

        while (testCases-- > 0) {
            String x = getString();
            String y = getString();

            if (isMatched(x, y))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    boolean isMatched (String x, String y)
    {
        for (int i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) == y.charAt(i))
                continue;
            else if (x.charAt(i) == '?' && y.charAt(i) != '?')
                continue;
            else if (x.charAt(i) != '?' && y.charAt(i) == '?')
                continue;
            else
                x = "No";
                break;
        }

        return !x.equals("No");
    }

    String getString ()
    {
        return sc.next();
    }

    int getInteger ()
    {
        return sc.nextInt();
    }
}
