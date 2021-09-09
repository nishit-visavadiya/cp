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
        //Integer num = Integer.parseInt(str);
        return Integer.parseInt(str);
        //return num;
    }

    String getString()
    {
        return sc.nextLine();
    }
}
