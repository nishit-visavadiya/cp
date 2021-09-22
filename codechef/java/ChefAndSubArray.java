package codechef.java;

import java.util.Scanner;

public class ChefAndSubArray {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndSubArray chefAndSubArray = new ChefAndSubArray();
        chefAndSubArray.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int sizeOfArray = getInteger();

            int[] arr = getArray(sizeOfArray);

            System.out.println(sumAndProductAreEqual(sizeOfArray, arr));
        }
    }

    int sumAndProductAreEqual(int sizeOfArray, int[] arr)
    {
        int count = 0;

        for (int i = 0; i < sizeOfArray; i++)
        {
            int sum = 0;
            int product = 1;
            for (int j = i; j < sizeOfArray; j++)
            {
                sum += arr[j];
                product *= arr[j];

                if (sum == product)
                    count++;
            }
        }

        return count;
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
