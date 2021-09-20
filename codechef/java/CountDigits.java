package codechef.java;

import java.util.Scanner;

public class CountDigits {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CountDigits countDigits = new CountDigits();
        System.out.println(countDigits.countDigits());
    }

    String countDigits()
    {
        int number = getInteger();
        int count = 0;

        while (number > 0)
        {
            number /= 10;
            count++;
        }

        return count > 3 ? "More than 3 digits" : String.valueOf(count);
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
