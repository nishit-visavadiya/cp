package codechef.java;

import java.util.Scanner;

public class AdaSchool {

    Scanner scanner = new Scanner(System.in);

    int row;
    int column;

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
            row = getInteger();
            column = getInteger();

            if (bothCountAreEven())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    boolean bothCountAreEven()
    {
        return row % 2 == 0 || column % 2 == 0;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
