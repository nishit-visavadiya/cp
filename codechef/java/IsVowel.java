package codechef.java;

import java.util.Scanner;

public class IsVowel {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        IsVowel isVowel = new IsVowel();

        if (isVowel.isVowel())
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

    boolean isVowel()
    {
        char C = getCharValue();
        return C == 'A' || C == 'E' || C == 'I' || C == 'O' || C == 'U' ||
                C == 'a' || C == 'e' || C == 'i' || C == 'o' || C == 'u';
    }

    char getCharValue()
    {
        return sc.next().charAt(0);
    }
}
