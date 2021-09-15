package codechef.java;

import java.util.Arrays;
import java.util.Scanner;

public class Lapindromes {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases --> 0)
        {
            String s = sc.next();
            int len = s.length();
            String lastChar = s.substring((len / 2) + (len % 2));
            String firstChar = s.substring(0, len / 2);

            char[] f = firstChar.toCharArray();
            char[] l = lastChar.toCharArray();

            Arrays.sort(f);
            Arrays.sort(l);

            firstChar = String.copyValueOf(f);
            lastChar = String.copyValueOf(l);

            System.out.println((firstChar.equals(lastChar)) ? "YES" : "NO");
        }
    }
}
