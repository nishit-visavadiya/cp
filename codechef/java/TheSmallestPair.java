package codechef.java;

import java.util.Scanner;

public class TheSmallestPair {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        TheSmallestPair theSmallestPair = new TheSmallestPair();
        theSmallestPair.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfArray = getInteger();

            int[] arr = getArray(numberOfArray);

            System.out.println(sumOfFirstTwoMinimumNumberInArray(arr));
        }
    }

    int sumOfFirstTwoMinimumNumberInArray(int[] arr)
    {
        int minimumElement = Integer.MAX_VALUE;
        int secondMinimum = minimumElement;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < minimumElement)
            {
                secondMinimum = minimumElement;
                minimumElement = arr[i];
            }
            else
            {
                if (arr[i] < secondMinimum)
                    secondMinimum = arr[i];
            }
        }

        return minimumElement + secondMinimum;
    }

    int[] getArray(int size)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = getInteger();
        }

        return arr;
    }

    int getInteger()
    {
        return sc.nextInt();
    }

}
