package codechef.java;

import java.util.Scanner;

public class RajuAndTrip {

    Scanner sc = new Scanner(System.in);

    int number;

    public static void main(String[] args)
    {
        RajuAndTrip rajuAndTrip = new RajuAndTrip();
        rajuAndTrip.execute();
    }

    void execute()
    {
        number = getInteger();

        printAnswer();
    }

    void printAnswer()
    {
        if (isNumberMultipleOfFiveOrSix())
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    boolean isNumberMultipleOfFiveOrSix()
    {
        return number % 5 == 0 || number % 6 == 0;
    }

    int getInteger() {
        return sc.nextInt();
    }
}
