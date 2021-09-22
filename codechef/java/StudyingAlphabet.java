package codechef.java;

import java.util.Scanner;

public class StudyingAlphabet {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        StudyingAlphabet studyingAlphabet = new StudyingAlphabet();
        studyingAlphabet.execute();
    }

    void execute()
    {
        String wordKnownByJeff = getString();

        int numberOfAlphabetInDictionary = getInteger();

        while (numberOfAlphabetInDictionary --> 0)
        {
            String wordInDictionary = getString();

            if (findAlphabet(wordKnownByJeff, wordInDictionary))
                System.out.println("Yes");
            else
                System.out.println("No");

        }

    }

    boolean findAlphabet(String wordKnownByJeff, String wordInDictionary)
    {
        int count = 0;
        for (int i = 0; i < wordKnownByJeff.length(); i++)
        {
            for (int j = 0; j < wordInDictionary.length(); j++)
            {
                if (wordKnownByJeff.charAt(i) == wordInDictionary.charAt(j))
                {
                    count++;
                }
            }
        }

        return count == wordInDictionary.length();
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
