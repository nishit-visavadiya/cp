package codechef.java;

import java.util.Scanner;

public class ChefAndFruits {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndFruits chefAndFruits = new ChefAndFruits();
        chefAndFruits.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfApples = getInteger();
            int numberOfOranges = getInteger();
            int goldCoin = getInteger();

            System.out.println(findMinimumDifference(numberOfApples, numberOfOranges, goldCoin));
        }
    }

    int findMinimumDifference(int numberOfApples, int numberOfOranges, int gold)
    {
        int minimumDifference = Math.min(Math.abs(numberOfApples - numberOfOranges), gold);

        if (numberOfApples > numberOfOranges)
        {
            numberOfOranges += minimumDifference;
        }
        else if (numberOfApples < numberOfOranges)
        {
            numberOfApples += minimumDifference;
        }
        return Math.abs(numberOfApples - numberOfOranges);
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
