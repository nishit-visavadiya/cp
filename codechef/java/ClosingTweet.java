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
        int numberOfTweets = getInteger();
        int numberOfClicks = getInteger();

        boolean[] t = new boolean[numberOfTweets];

        for (int i = 0; i < numberOfClicks; i++)
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

            for (int j = 0; j < numberOfTweets; j++)
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
