package codechef.java;

import java.util.Scanner;

public class FarmerFeb {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        FarmerFeb farmerFeb = new FarmerFeb();
        farmerFeb.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int harvestedFromFirstField = getInteger();
            int harvestedFromSecondField = getInteger();

            System.out.println(countForPrimeNumber(harvestedFromFirstField, harvestedFromSecondField));
        }
    }

    int countForPrimeNumber(int harvestedFromFirstField, int harvestedFromSecondField)
    {
        int sumOfPotato = harvestedFromFirstField + harvestedFromSecondField;

        for (int currentNumber = sumOfPotato + 1; ; currentNumber++)
        {
            if (isPrime(currentNumber))
            {
                return currentNumber - sumOfPotato;
            }
        }
    }

    boolean isPrime(int number)
    {
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
