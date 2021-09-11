package codechef.java;

import java.util.Scanner;

public class WhichDiv {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        WhichDiv whichDiv = new WhichDiv();
        whichDiv.findRating();
    }

    void findRating()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int rating = getInteger();

            if (rating < 1600)
            {
                System.out.println("3");
            }
            else if (rating < 2000)
            {
                System.out.println("2");
            }
            else
                System.out.println("1");

        }
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
