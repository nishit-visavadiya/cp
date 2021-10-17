package codechef.java;

import java.util.Scanner;

public class TestMatchSeries {

    Scanner scanner = new Scanner(System.in);

    int indiaWonTotalMatch, englandWonTotalMatch, totalDraw;

    int[] rounds;

    public static void main(String[] args)
    {
        TestMatchSeries testMatchSeries = new TestMatchSeries();
        testMatchSeries.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            rounds = getArray();

            determineWhoWon();
        }
    }

    void determineWhoWon()
    {
        indiaWonTotalMatch = indiaWinningMatch();
        englandWonTotalMatch = englandWinningMatch();
        totalDraw = totalDrawMatch();

        if (indiaWonTotalMatch > 2 || indiaWonTotalMatch > englandWonTotalMatch)
            System.out.println("India");
        else if (englandWonTotalMatch > 2 || englandWonTotalMatch > indiaWonTotalMatch)
            System.out.println("England");
        else
            System.out.println("Draw");
    }

    int indiaWinningMatch()
    {
        int count = 0;
        for(int i=0;i<5;i++)
        {
            if(isIndia(i))
                count++;
        }
        return count;
    }

    int englandWinningMatch()
    {
        int count = 0;
        for(int i=0;i<5;i++)
        {
            if(isEngland(i))
                count++;
        }
        return count;
    }

    int totalDrawMatch()
    {
        int count = 0;
        for(int i=0;i<5;i++)
        {
            if(isDraw(i))
                count++;
        }
        return count;
    }

    boolean isIndia(int i)
    {
        return rounds[i]==1;
    }
    boolean isEngland(int i)
    {
        return rounds[i]==2;
    }
    boolean isDraw(int i)
    {
        return rounds[i]==0;
    }


    int[] getArray()
    {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
        {
            arr[i] = getInteger();
        }

        return arr;
    }



    int getInteger()
    {
        return scanner.nextInt();
    }
}
