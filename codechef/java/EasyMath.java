package codechef.java;

import java.util.Scanner;

public class EasyMath {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        EasyMath easyMath = new EasyMath();
        easyMath.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfArray = getInteger();
            int[] arr = getArray(numberOfArray);

            System.out.println(calculateTheMaximumSumOfDigits(arr));
        }
    }

    int calculateTheMaximumSumOfDigits(int[] arr)
    {
        int product = 1;
        int sum = 0;
        int x = 0;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                product = arr[i] * arr[j];
                sum = 0;
                while (product > 0)
                {
                    sum = sum + product % 10;
                    product = product / 10;
                }
                if (x < sum)
                {
                    x = sum;
                }
            }
            product = 1;
        }
        return x;
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
