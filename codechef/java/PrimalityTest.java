package codechef.java;

import java.util.Scanner;

public class PrimalityTest {

    //Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
//        PrimalityTest primalityTest = new PrimalityTest();
//        primalityTest.execute();

        Scanner sc = new Scanner(System.in);

        int testcase =sc.nextInt();
        for(int i=0;i<testcase ;i++)
        {
            int x=sc.nextInt();
            int c=0;
            for(int j=1;j<=x;j++)
            {
                if(x%j==0)
                    c+=1;
            }
            if(c==2)
                System.out.println("yes");
            else
                System.out.println("no");

        }
    }

    /*void execute()
    {
        int testCases = getInteger();

        while (testCases -- > 0)
        {
            int n = getInteger();
            System.out.println(primality(n));
        }
    }

    String primality(int n)
    {
        if (n == 1)
        {
            System.out.println("no");
        }

        boolean prime = true;

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println("yes");
        else
            System.out.println("no");

        return "";
    }

    int getInteger()
    {
        return sc.nextInt();
    }*/
}
