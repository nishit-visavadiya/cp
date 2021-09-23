package codechef.java;

import java.util.Scanner;

public class SimilarDishes {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        SimilarDishes similarDishes = new SimilarDishes();
        similarDishes.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            String[] str1 = getStringArray();
            String[] str2 = getStringArray();

            if (isSimilar(str1, str2))
                System.out.println("similar");
            else
                System.out.println("dissimilar");
        }
    }

    boolean isSimilar(String[] str1, String[] str2)
    {
        int count = 0;

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (str1[i].equals(str2[j]))
                    count++;
            }
        }

        return count == 4 || count / 2 == 2;
    }

    String[] getStringArray()
    {
        String[] strings = new String[4];
        for (int i = 0; i < 4; i++)
        {
            strings[i] = getString();
        }
        return strings;
    }

    String getString()
    {
        return scanner.next();
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
