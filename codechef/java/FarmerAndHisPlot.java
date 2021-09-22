package codechef.java;

import java.util.Scanner;

public class FarmerAndHisPlot {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        FarmerAndHisPlot fP = new FarmerAndHisPlot();
        fP.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int length = getInteger();
            int breadth = getInteger();

            System.out.println(findMinimumNumberOfSquare(length, breadth));
        }
    }

    int findMinimumNumberOfSquare(int length, int breadth)
    {
        return (length / gcd(length, breadth)) * (breadth / gcd(length, breadth));
    }

    int gcd(int a, int b)
    {
        if (b > a)
            return gcd(b, a);
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
