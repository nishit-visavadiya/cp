package codechef.java;

import java.util.Scanner;

public class MutatedMinions {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        MutatedMinions mutatedMinions = new MutatedMinions();
        mutatedMinions.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int n = getInteger();
            int k = getInteger();

            System.out.println(numberOfMinionsBecomeWolverine(n, k));
        }
    }

    int numberOfMinionsBecomeWolverine(int n, int k)
    {
        int count = 0;

        for (int i = 0; i < n; i++)
        {
            int a = getInteger();
            if ((a + k) % 7 == 0)
                count++;
        }

        return count;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
