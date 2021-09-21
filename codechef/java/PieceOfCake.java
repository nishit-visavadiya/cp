package codechef.java;

import java.util.Arrays;
import java.util.Scanner;

    public class PieceOfCake {

        Scanner sc = new Scanner(System.in);

        public static void main(String[] args)
        {
            PieceOfCake pieceOfCake = new PieceOfCake();
            pieceOfCake.execute();
        }

        void execute()
        {
            int testCases = getInteger();

            while (testCases --> 0)
            {
                String str = getString();

    //            if (numberOfOccurrenceOfCharacter(str))
    //                System.out.println("Yes");
    //            else
    //                System.out.println("No");

                int[] frequency = new int[26];

                for (int i = 0; i < str.length(); i++)
                {
                    int n = str.charAt(i) - 'a';
                    frequency[n]++;
                }

                Arrays.sort(frequency);

                int last = frequency[frequency.length - 1];

                if (last * 2 == str.length())
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }

    //    boolean numberOfOccurrenceOfCharacter(String str)
    //    {
    //        int[] frequency = new int[26];
    //
    //        for (int i = 0; i < str.length(); i++)
    //        {
    //            int n = str.charAt(i) - 'a';
    //            frequency[n]++;
    //        }
    //
    //        Arrays.sort(frequency);
    //
    //        int last = frequency[frequency.length - 1];
    //
    //        return last * 2 == str.length();
    //    }

        String getString()
        {
            return sc.next();
        }

        int getInteger()
        {
            return sc.nextInt();
        }
    }
