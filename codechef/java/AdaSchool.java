package codechef.java;

import java.util.Scanner;

public class AdaSchool {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        AdaSchool adaSchool = new AdaSchool();
        adaSchool.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int row = getInteger();
            int column = getInteger();

            if (canShuffle(row, column))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    boolean canShuffle(int row, int column)
    {
        return row % 2 == 0 && column % 2 == 0;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
