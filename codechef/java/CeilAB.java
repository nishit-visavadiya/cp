package codechef.java;

import java.util.Scanner;

public class CeilAB {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CeilAB ceilAB = new CeilAB();
        ceilAB.execute();
    }

    void execute()
    {
        int n1 = getInteger();
        int n2 = getInteger();
        System.out.println(wrongAnswerOfWaiter(n1, n2));
    }

    int wrongAnswerOfWaiter(int n1, int n2)
    {
        int answer = subtract(n1, n2);

        if (answer % 10 == 9)
        {
            answer--;
        }
        else
        {
            answer++;
        }
        return answer;
    }

    int subtract(int a, int b)
    {
        return a - b;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
