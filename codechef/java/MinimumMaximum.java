package codechef.java;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumMaximum {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        MinimumMaximum minimumMaximum = new MinimumMaximum();
        minimumMaximum.execute();
    }

    void execute()
    {
        long testCases = getLongValue();

        while (testCases --> 0)
        {
            int sizeOfArray = getIntegerValue();
            long[] arr = getArray(sizeOfArray);

            System.out.println(findMinimumSumOfCoast(sizeOfArray, arr));
        }
    }

    long findMinimumSumOfCoast(long sizeOfArray, long[] arr)
    {
        Arrays.sort(arr);

        long minimumElement = arr[0];

        long number  = sizeOfArray - 1;

        return minimumElement * number;
    }

    long[] getArray(int size)
    {
        long[] arr = new long[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = getLongValue();
        }

        return arr;
    }

    int getIntegerValue()
    {
        return sc.nextInt();
    }

    long getLongValue()
    {
        return sc.nextLong();
    }
}
