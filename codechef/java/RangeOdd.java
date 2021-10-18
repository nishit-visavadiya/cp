package codechef.java;

import java.util.Scanner;

public class RangeOdd {

    Scanner sc = new Scanner(System.in);

    int left, right;

    public static void main(String[] args)
    {
        RangeOdd rangeOdd = new RangeOdd();
        rangeOdd.execute();
    }

    void execute()
    {
        left = getInteger();
        right = getInteger();

        for (int i = left; i <= right; i++)
        {
            if (isRangeOdd(i))
                System.out.println(i + " ");
        }
    }

    int getInteger() {
        return sc.nextInt();
    }

    boolean isRangeOdd(int i)
    {
        return i % 2 != 0;
    }
}
