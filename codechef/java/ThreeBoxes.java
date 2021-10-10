package codechef.java;

import java.util.Scanner;

public class ThreeBoxes {

    Scanner scanner = new Scanner(System.in);

    int firstBox, secondBox, thirdBox, sizeOfBag;

    public static void main(String[] args)
    {
        ThreeBoxes threeBoxes = new ThreeBoxes();
        threeBoxes.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            firstBox = getInteger();
            secondBox = getInteger();
            thirdBox = getInteger();
            sizeOfBag = getInteger();

            System.out.println(calculateMinimumNumberOfBagsChefNeeds());
        }
    }

    int calculateMinimumNumberOfBagsChefNeeds()
    {
        if (sumOfAllBoxesAreLessThanOrEqualToBag())
            return  1;
        else if (sumOfAnyTwoBoxesAreLessThanOrEqualToBag())
            return  2;
        else
            return  3;
    }

    boolean sumOfAllBoxesAreLessThanOrEqualToBag()
    {
        return firstBox + secondBox + thirdBox <= sizeOfBag;
    }

    boolean sumOfAnyTwoBoxesAreLessThanOrEqualToBag()
    {
        return firstBox + secondBox <= sizeOfBag || firstBox + thirdBox <= sizeOfBag;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
