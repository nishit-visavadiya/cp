package codechef.java;

import java.util.Scanner;

public class TheLeadGame {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        int lead = 0, winner = 0;
        int difference;
        while (n --> 0)
        {
            int playerOne = sc.nextInt();
            int playerTwo = sc.nextInt();

            sum1 += playerOne;
            sum2 += playerTwo;

            if (sum1 > sum2)
            {
                difference = sum1 - sum2;
                if (difference > lead)
                {
                    lead = difference;
                    winner = 1;
                }
            }
            else
            {
                difference = sum2 - sum1;
                if (difference >lead)
                {
                    lead = difference;
                    winner = 2;
                }
            }
        }
        System.out.println(winner + " " + lead);
    }

}
