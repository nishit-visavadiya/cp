package codechef.java;

import java.util.Scanner;

public class WhichMixture {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int AUnitOfSolid = getInteger();
            int BUnitOfSolid = getInteger();

            System.out.println(whichTypeOfMixtureDoesChefProvide(AUnitOfSolid, BUnitOfSolid));
        }
    }

    String whichTypeOfMixtureDoesChefProvide(int AUnitOfSolid, int BUnitOfSOlid)
    {
        String mixture;

        if (AUnitOfSolid > 0 && BUnitOfSOlid > 0)
        {
            mixture = "Solution";
        }
        else if (AUnitOfSolid == 0)
        {
            mixture = "Liquid";
        }
        else
            mixture = "Solid";

        return mixture;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
