package random;

import java.util.Scanner;

public class SubString {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        SubString subString = new SubString();
        subString.findSubString();
    }

    String findSubString()
    {
        String s = getString();

        int start = getInteger();
        int end = getInteger();

        for (int i = start; i < end; i++)
        {
            System.out.print(s.charAt(i));
        }

        return s;
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
