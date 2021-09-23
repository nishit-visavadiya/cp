package codechef.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ForgottenLanguage {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ForgottenLanguage forgottenLanguage=new ForgottenLanguage();
        forgottenLanguage.executeTestCase();

    }

    void executeTestCase()
    {
        int numberOfTestCases = getInteger();

        while(numberOfTestCases-->0)
        {
            int numberOfWordInOldDictionary = getInteger();
            int newWord = getInteger();
            String[] oldWords=getDictionaryWords(numberOfWordInOldDictionary);
            String[] newWords=newWordsArray(newWord);
            printOut(numberOfWordInOldDictionary, oldWords, newWords);
        }
    }

    void printOut(int numberOfWordInOldDictionary, String[] oldWords, String[] newWords)
    {
        for (int i = 0; i < numberOfWordInOldDictionary; i++)
        {
            if (is(numberOfWordInOldDictionary, oldWords, newWords))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    boolean is(int numberOfWordInOldDictionary, String[] oldWords, String[] newWords)
    {
        for (int i = 0; i < numberOfWordInOldDictionary; i++)
        {
            for (String newWord : newWords) {
                if (oldWords[i].equals(newWord))
                    return true;
            }
        }
        return false;
    }

    String[] newWordsArray(int newWord)
    {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < newWord; i++)
        {
            int numberOfNewWord = getInteger();
            for (int j = 0; j < numberOfNewWord; j++)
            {
                words.add(getString());
            }
        }
        return newEords111(words);
    }

    String[] newEords111(ArrayList<String> words) {
        String[] newWords = new String[words.size()];
        for(int i = 0 ; i < words.size() ; i++)
            newWords[i] = words.get(i);
        return newWords;
    }

    String[] getDictionaryWords(int numbers)
    {
        String[] words = new String[numbers];

        for (int i = 0; i < numbers; i++)
        {
            words[i] = getString();
        }
        return words;
    }

    String getString(){
        return sc.next();
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
