package codechef.java;

import java.util.Scanner;

public class EquinoxString {

    Scanner sc = new Scanner(System.in);

    long sarthak = 0, anuradha = 0;

    public static void main(String[] args)
    {
        EquinoxString es = new EquinoxString();
        es.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int n = getInteger();
            int a = getInteger();
            int b = getInteger();

            System.out.println(findTheCharacter(n, a, b));
        }
    }

    String findTheCharacter(int numberOfString, int pointsOfSarthak, int pointsOfAnuradha)
    {
        String[] s = new String[numberOfString];
        getString();

        for (int i = 0; i < numberOfString; i++)
        {
            s[i] = getString();
            if(s[i].startsWith("E") || s[i].startsWith("Q") || s[i].startsWith("U") ||
                    s[i].startsWith("I") || s[i].startsWith("N") || s[i].startsWith("O") || s[i].startsWith("X")) {
                sarthak += pointsOfSarthak;
            }
            else {
                anuradha+=pointsOfAnuradha;
            }
        }
        return checkForWinner(sarthak, anuradha);
    }

    String checkForWinner(long sarthak, long anuradha)
    {
        if (sarthak == anuradha)
            return "DRAW";
        else if (sarthak > anuradha)
            return "SARTHAK";
        else
            return "ANURADHA";
    }

    String getString()
    {
        return sc.nextLine();
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
