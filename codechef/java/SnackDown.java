package codechef.java;

import java.util.Scanner;

public class SnackDown {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        SnackDown snackDown = new SnackDown();
        snackDown.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int year = getInteger();

            if (isHosted(year))
                System.out.println("HOSTED");
            else
                System.out.println("NOT HOSTED");
        }
    }

    boolean isHosted(int year)
    {
        return year == 2010 || year == 2015 || year == 2016 || year == 2017 || year == 2019;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
