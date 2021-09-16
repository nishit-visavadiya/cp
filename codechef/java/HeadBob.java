package codechef.java;

import java.util.Scanner;

public class HeadBob {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        HeadBob headBob = new HeadBob();
        headBob.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int person = getInteger();
            String str = getString();
            char[] temp = str.toCharArray();

            System.out.println(identifyIndianOrNot(temp, person));
        }
    }

    String identifyIndianOrNot(char[] temp, int person)
    {
        String result = "";
        boolean certain = false;

        for (int i = 0; i < person; i++)
        {
            if (temp[i] == 'N')
            {
                continue;
            }
            else
            {
                certain = true;
                if (temp[i] == 'I')
                {
                    result = "INDIAN";
                    break;
                }
                else if (temp[i] == 'Y')
                {
                    result = "NOT INDIAN";
                    break;
                }
            }
        }

        if (!certain)
            result = "NOT SURE";

        return result;
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
