package codechef.java;

import java.util.Scanner;

public class EquinoxString {

    Scanner sc = new Scanner(System.in);

    int sarthak = 0, anuradha = 0;

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
            int numberOfString = getInteger();
            int pointsOfSarthak = getInteger();
            int pointsOfAnuradha = getInteger();

            System.out.println(findTheCharacter(numberOfString, pointsOfSarthak,pointsOfAnuradha));
        }
    }

    String findTheCharacter(int numberOfString, int pointsOfSarthak, int pointsOfAnuradha)
    {
        while (numberOfString --> 0)
        {
            String s = getString();

            if (s.charAt(0) == 'E' || s.charAt(0) == 'Q' || s.charAt(0) == 'U' ||
                    s.charAt(0) == 'I' || s.charAt(0) == 'N' || s.charAt(0) == 'O' || s.charAt(0) == 'X')
            {
                sarthak += pointsOfSarthak;
            }
            else
            {
                anuradha += pointsOfAnuradha;
            }
        }
        return checkForWinner(sarthak, anuradha);
    }

    String checkForWinner(int sarthak, int anuradha)
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
        return sc.next();
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
