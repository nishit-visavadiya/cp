package codechef.java;

import java.util.Scanner;

public class GCDAndLCM {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        GCDAndLCM gcdAndLCM = new GCDAndLCM();
        gcdAndLCM.execute();
    }

    void execute()
    {
        int testCases = getInteger();
        long a, b, gcd, lcm;
        while (testCases -- > 0)
        {
            a = getInteger();
            b = getInteger();
            gcd = getGcd(a, b);

            lcm = (a * b) / gcd;

            System.out.println(gcd + " " + lcm);
        }
    }

    long getGcd(long a, long b)
    {
        while(a != b) {
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}

//TODO better way to find gcd
        /*while (number1 != number2) {
            if (number1 > number2)
                number1 -= number2;
            else
                number2 -= number1;
        }*/
