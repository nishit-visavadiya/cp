package codechef.java;

import java.util.Scanner;

public class AlternatingSubArrayPrefix {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        AlternatingSubArrayPrefix  aSA = new AlternatingSubArrayPrefix();
        aSA.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int sizeOfArray = getInteger();
            int[] arr = getArray(sizeOfArray);

            printArray(findSubArray(sizeOfArray, arr));
        }
    }

    int[] findSubArray(int sizeOfArray, int[] arr)
    {
        int x = sizeOfArray - 2;
        int[] result = new int[sizeOfArray];
        result[sizeOfArray - 1] = 1;
        while (x >= 0)
        {
            if ((arr[x] > 0 && arr[x + 1] < 0) || (arr[x] < 0 && arr[x + 1] > 0))
            {
                result[x] = result[x + 1] + 1;
            }
            else
            {
                result[x] = 1;
            }
            x--;
        }
        return result;
    }

    void printArray(int[] array)
    {
        for (int j : array) {
            System.out.print(j + " ");
        }
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
