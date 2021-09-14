package codechef.java;

import java.util.Scanner;

public class PrimalityTest {


    public static void main(String[] args)
    {
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
}
