package codechef.java;

import java.util.Scanner;

public class Sticks {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Sticks sticks = new Sticks();
        sticks.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases -- > 0)
        {
            int numberOfSticks = getInteger();

            int[] arr = setArray(numberOfSticks);

            System.out.println(makeRectangle(numberOfSticks, arr));
        }
    }

    int makeRectangle(int numberOfSticks, int[] arr)
    {
        int[] frequency = new int[1001];

        for (int i = 0; i < numberOfSticks; i++)
        {
            frequency[arr[i]] += 1;
        }

        int area = 1;

        boolean flag = false;
        boolean isDone = false;

        for (int i = frequency.length - 1; i >= 0; i--)
        {
            if (!flag)
            {
                if (frequency[i] >= 2) {
                    area *= i;
                    flag = true;
                    frequency[i] -= 2;
                }
            }
            if (flag)
            {
                if (frequency[i] >= 2)
                {
                    area *= i;
                    isDone = true;
                    break;
                }
            }
        }

        if (isDone)
            return area;
        else
            return -1;
    }

    int[] setArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
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
