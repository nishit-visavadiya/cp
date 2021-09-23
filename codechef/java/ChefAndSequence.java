package codechef.java;

import java.util.Scanner;

public class ChefAndSequence {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndSequence chefAndSequence = new ChefAndSequence();
        chefAndSequence.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int nNumberOfIntegers = getInteger();
            int[] arr1 = getArray(nNumberOfIntegers);

            int mNumberOfIntegers = getInteger();
            int[] arr2 = getArray(mNumberOfIntegers);

            if (isSequence(arr1, arr2))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    boolean isSequence(int[] arr1, int[] arr2)
    {
        int count = 0;
        for (int i : arr1) {
            if (i == arr2[count]) {
                count++;
            }
            if (count == arr2.length)
                break;
        }

        return count == arr2.length;
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
        return scanner.nextInt();
    }
}
