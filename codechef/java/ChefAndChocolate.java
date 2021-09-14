package codechef.java;

import java.util.Scanner;

public class ChefAndChocolate {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndChocolate chefAndChocolate = new ChefAndChocolate();
        chefAndChocolate.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases -- > 0)
        {
            int n = getInteger();
            int m = getInteger();
            System.out.println(chocolate(n, m));
        }
    }

    String chocolate(int n, int m)
    {
        if (n % 2 == 0 || m % 2 == 0)
            return "Yes";
        else
            return "No";
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
