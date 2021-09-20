package codechef.java;

import java.util.Scanner;

public class CoinsAndTriangle {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CoinsAndTriangle coinsAndTriangle = new CoinsAndTriangle();
        coinsAndTriangle.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int gold = getInteger();
            System.out.println(findTriangle(gold));
        }
    }

    int findTriangle(int gold)
    {
        int ans = 0;
        while (gold >= 1 && ans < gold)
        {
            ans++;
            gold = gold - ans;
        }
        return ans;

        /*int gold;
        gold = sc.nextInt();
        int sum = 0,c=0;
        for(int i = 1; ; i++)
        {
            sum += j;

            if(sum <= gold)
            {
                c++;
            }
            else
            {
                break;
            }
        }
        return c; */
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
