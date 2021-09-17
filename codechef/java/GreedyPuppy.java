package codechef.java;

import java.util.Scanner;

public class GreedyPuppy {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        GreedyPuppy greedyPuppy = new GreedyPuppy();
        greedyPuppy.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfCoins = getInteger();
            int numberOfPeople = getInteger();

            System.out.println(maximumNumberOfCoins(numberOfCoins, numberOfPeople));
        }
    }

    int maximumNumberOfCoins(int numberOfCoins, int numberOfPeople)
    {
        int max = 0;

        for (int i = 1; i <= numberOfPeople; i++)
        {
            if (max < numberOfCoins % i)
                max = numberOfCoins % i;
        }

        return max;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
