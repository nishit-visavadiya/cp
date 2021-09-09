package codingbat.string3;

import java.util.Scanner;

public class SameEnds {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        SameEnds sameEnds = new SameEnds();
        sameEnds.execute();
    }

    void execute()
    {
        String s = getString();
        System.out.println(sameEnds(s));
    }

    String sameEnds(String string)
    {
        int len = string.length();

        String result = "";
        String temp = "";

        for (int i = 0; i < len; i++)
        {
            temp += string.charAt(i);
            int tempLen = temp.length();
            if (i < len / 2 && temp.equals(string.substring(len - tempLen, len)))
            {
                result = temp;
            }
        }
        return result;
    }

    String getString()
    {
        return sc.nextLine();
    }
}
