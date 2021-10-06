package codechef.java;

import java.util.Scanner;

public class WhichMixture {

    Scanner scanner = new Scanner(System.in);

    int AUnitOfSolid;
    int BUnitOfSolid;

    public static void main(String[] args)
    {
        WhichMixture whichMixture = new WhichMixture();
        whichMixture.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            AUnitOfSolid = getInteger();
            BUnitOfSolid = getInteger();

            System.out.println(whichTypeOfMixtureDoesChefProvide());
        }
    }

    String whichTypeOfMixtureDoesChefProvide()
    {
        if (bothUnitOfSolidMoreThanZero())
            return "Solution";
        else if (AUnitOfSolidIsZero())
            return "Liquid";
        else
            return "Solid";
    }

    boolean AUnitOfSolidIsZero()
    {
        return AUnitOfSolid == 0;
    }

    boolean bothUnitOfSolidMoreThanZero()
    {
        return AUnitOfSolid > 0 && BUnitOfSolid > 0;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
