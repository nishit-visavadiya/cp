package codechef.java;

import java.util.Scanner;

public class MalvikaAndBalloons {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        MalvikaAndBalloons mB = new MalvikaAndBalloons();
        mB.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            String balloons = getString();
            System.out.println(findMinimumBalloonsToPaint(balloons));
        }
    }

    int findMinimumBalloonsToPaint(String balloons)
    {
        int amberColor = 0;
        int brassColor = 0;
        for (int i = 0; i < balloons.length(); i++)
        {
            if (balloons.charAt(i) == 'a')
                amberColor++;
            else if (balloons.charAt(i) == 'b')
                brassColor++;
        }

        return Math.min(amberColor, brassColor);
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
