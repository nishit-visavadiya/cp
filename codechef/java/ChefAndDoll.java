package codechef.java;

import java.util.Scanner;

public class ChefAndDoll {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndDoll chefAndDoll = new ChefAndDoll();
        chefAndDoll.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfDolls = getInteger();

            int[] a = getArray(numberOfDolls);

            for (int i = 0; i < numberOfDolls; i++)
            {
                int count = 0;
                for (int j = 0; j < numberOfDolls; j++)
                {
                    if (a[i] == a[j])
                        count++;
                }

                if (count % 2 == 1)
                {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }

//    int missingDoll(int numberOfDolls, int[] a)
//    {
//        for (int i = 0; i < numberOfDolls; i++)
//        {
//            int count = 0;
//            for (int j = 0; j < numberOfDolls; j++)
//            {
//                if (a[i] == a[j])
//                    count++;
//            }
//
//            if (count % 2 == 1)
//            {
//                System.out.println(count);
//                break;
//            }
//        }
//
//    }

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
