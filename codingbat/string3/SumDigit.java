package codingbat.string3;

import java.util.Scanner;

public class SumDigit {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        SumDigit sumDigit = new SumDigit();
        sumDigit.execute();
    }

    void execute()
    {
        String s = getString();
        System.out.println(sumDigit(s));
    }

    int sumDigit(String str)
    {
        int sum = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                String temp = str.substring(i, i + 1);
                sum += Integer.parseInt(temp);
            }
        }
        return sum;
    }

    String getString()
    {
        return sc.nextLine();
    }
}
