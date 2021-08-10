package codechef;

import java.util.Scanner;

public class OlympicsRanking {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        OlympicsRanking olympicsRanking = new OlympicsRanking();
        olympicsRanking.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int G1 = getInteger();
            int S1 = getInteger();
            int B1 = getInteger();

            int G2 = getInteger();
            int S2 = getInteger();
            int B2 = getInteger();

            System.out.println(ranking(G1, S1, B1, G2, S2, B2));
        }
    }

    int ranking(int G1, int S1, int B1, int G2, int S2, int B2)
    {
       int rank = 0;

       if (G1 + S1 + B1 > G2 + S2 + B2)
           rank = 1;
       else
           rank = 2;

       return rank;
    }

    int getInteger()
    {
        return sc.nextInt();
    }

}
