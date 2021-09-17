package codechef.java;

import java.util.Scanner;

public class SumsInTriangle {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        SumsInTriangle sumsInTriangle = new SumsInTriangle();
        sumsInTriangle.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int n = getInteger();
            int[][] arr = get2DArray(n);
            System.out.println(getSumInATriangle(n, arr));
        }
    }

    int getSumInATriangle(int n, int[][] arr)
    {
        int[][] dp = new int[n + 1][n + 1];

        for (int j = 1; j <= n; j++)
        {
            dp[n][j] = arr[n][j];
        }

        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                dp[i][j] = arr[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        return dp[1][1];
    }

    int[][] get2DArray(int size)
    {
        int[][] arr = new int[size + 1][size +1];
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                arr[i][j] = getInteger();
            }
        }
        return arr;
    }

    int getInteger() {
        return sc.nextInt();
    }

}
