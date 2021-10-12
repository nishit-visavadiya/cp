package codechef.java;

import java.util.Scanner;

public class ChefAndOperators {

    Scanner scanner = new Scanner(System.in);

    int A,B;

    public static void main(String[] args)
    {
        ChefAndOperators chefAndOperators = new ChefAndOperators();
        chefAndOperators.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            A = getInteger();
            B = getInteger();

            System.out.println(findRelationShipBetweenAB());
        }
    }

    String findRelationShipBetweenAB()
    {
        if (aIsLessThanB())
            return "<";
        else if (aIsGreaterThanB())
            return ">";

        return "=";
    }

    boolean aIsLessThanB()
    {
        return A < B;
    }

    boolean aIsGreaterThanB()
    {
        return A > B;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
