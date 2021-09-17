package codechef.java;

import java.util.Scanner;

public class AmbiguousPermutations {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        AmbiguousPermutations aP = new AmbiguousPermutations();
        aP.execute();
    }

    void execute()
    {
        while (true)
        {
            int n = getInteger();
            int[] arr = getArray(n);

            if (n == 0)
                break;

            if (isAmbiguousPermutations(arr, n))
                System.out.println("ambiguous");
            else
                System.out.println("not ambiguous");
        }
    }

    boolean isAmbiguousPermutations(int[] arr, int n)
    {
        for (int i = 1; i <= n; i++)
        {
            if (arr[arr[i - 1] - 1] != i)
            {
                return false;
            }
        }
        return true;
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
