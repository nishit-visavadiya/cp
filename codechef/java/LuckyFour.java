package codechef.java;

import java.util.Scanner;

public class LuckyFour {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        LuckyFour luckyFour = new LuckyFour();
        System.out.println(luckyFour.luckyFour());
    }

    int luckyFour()
    {
        int testCases = getInteger();
        int count = 0;
        while (testCases -- > 0) {
            int number = getInteger();

            int reminder = number % 10;
            number = number / 10;

            if (reminder == 4)
                count++;
        }
        return count;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
