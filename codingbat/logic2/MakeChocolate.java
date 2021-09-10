package codingbat.logic2;

import java.util.Scanner;

public class MakeChocolate {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        MakeChocolate makeChocolate = new MakeChocolate();
        makeChocolate.execute();
    }

    void execute()
    {
        int small = getInteger();
        int big = getInteger();
        int goal = getInteger();
        System.out.println(makeChocolate(small, big, goal));
    }

    int makeChocolate(int small, int big, int goal)
    {
        int a = small + big * 5;
        int b = goal - big * 5;

        if (a < goal)
        {
            return -1;
        }
        if (big * 5 >= goal)
            return goal % 5;
        if (b < 0)
        {
            return 0;
        }

        return b;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
