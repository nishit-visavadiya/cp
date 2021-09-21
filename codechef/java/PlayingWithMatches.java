package codechef.java;

import java.util.Scanner;

public class PlayingWithMatches {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        PlayingWithMatches playingWithMatches = new PlayingWithMatches();
        playingWithMatches.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int a = getInteger();
            int b = getInteger();

            int[] arr = setArray();

            System.out.println(findTheMatches(a, b, arr));
        }
    }

    int findTheMatches(int a, int b, int[] arr)
    {
        int sum = sum(a, b);
        int matches = 0;
        while (sum > 0)
        {
            int reminder = sum % 10;
            sum = sum / 10;
            matches += arr[reminder];
        }
        return matches;
    }

    int[] setArray()
    {
        return new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    }

    int sum(int a, int b)
    {
        return a + b;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
