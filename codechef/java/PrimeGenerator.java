package codechef.java;

import java.util.Scanner;

public class PrimeGenerator {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        PrimeGenerator pG = new PrimeGenerator();
        pG.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int beginPoint = getInteger();
            int endPoint = getInteger();

            for (int i = beginPoint; i <= endPoint; i++)
            {
                if (isPrime(i))
                {
                    System.out.println(i);
                }
            }
            System.out.println();

        }
    }

    boolean isPrime(int number)
    {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
