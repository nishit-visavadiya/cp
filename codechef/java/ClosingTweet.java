package codechef.java;

import java.util.Arrays;
import java.util.Scanner;

public class ClosingTweet {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ClosingTweet closingTweet = new ClosingTweet();
        closingTweet.execute();
    }

    void execute()
    {
        int n = getInteger();
        int k = getInteger();
        boolean[] t = new boolean[n];
        for (int i = 0; i < k; i++)
        {
            String str = getString();
            if (str.equals("CLICK"))
            {
                int temp = getInteger();
                t[temp - 1] = !t[temp - 1];
            }
            if (str.equals("CLOSEALL"))
            {
                Arrays.fill(t, false);
            }
            int count = 0;
            for (int j = 0; j < n; j++)
            {
                if (t[j])
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    String getString()
    {
        return sc.next();
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
