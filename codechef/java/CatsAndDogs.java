package codechef.java;

import java.util.Scanner;

public class CatsAndDogs {

    Scanner sc = new Scanner(System.in);

    long numberOfCats, numberOfDogs, numberOfLegs;

    public static void main(String[] args)
    {
        CatsAndDogs catsAndDogs = new CatsAndDogs();
        catsAndDogs.execute();
    }

    void execute()
    {
        long testCases = getLongValue();

        while (testCases --> 0)
        {
            numberOfCats = getLongValue();
            numberOfDogs = getLongValue();
            numberOfLegs = getLongValue();

            if (isLegCountingIsRight())
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    boolean isLegCountingIsRight()
    {
        long minimumNumberOfLegs = calculateMinimumNumberOfLegs();
        long maximumNumberOfLegs = calculateMaximumNumberOfLegs();

        return minimumNumberOfLegs <= numberOfLegs && numberOfLegs <= maximumNumberOfLegs && numberOfLegs % 4 == 0;
    }

    long calculateMaximumNumberOfLegs()
    {
        return (4 * numberOfDogs) + (4 * numberOfCats);
    }

    long calculateMinimumNumberOfLegs()
    {
        long minimumNumberOfLegs = numberOfDogs * 4;
        long doubleNumberOfCats = numberOfDogs * 2; // 2 cats can ride on 1 dog;

        if (doubleNumberOfCats < numberOfCats)
        {
            minimumNumberOfLegs += (numberOfCats - doubleNumberOfCats) * 4;
            return minimumNumberOfLegs;
        }

        return minimumNumberOfLegs;
    }

    long getLongValue()
    {
        return sc.nextLong();
    }
}
