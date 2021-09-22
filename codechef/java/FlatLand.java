package codechef.java;

import java.util.Scanner;

public class FlatLand {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        FlatLand flatLand = new FlatLand();
        flatLand.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int number = getInteger();

            System.out.println(numberOfSquare(number));
        }

    }

    int numberOfSquare(int number)
    {
        int count = 0;
        while (number > 0)
        {
            int rootOfNumber = (int) Math.sqrt(number);
            number -= rootOfNumber * rootOfNumber;
            count++;
        }
        return count;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
