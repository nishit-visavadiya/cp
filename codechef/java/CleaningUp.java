package codechef.java;

import java.util.Scanner;

public class CleaningUp {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CleaningUp cleaningUp = new CleaningUp();
        cleaningUp.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfJobs = getInteger();
            int completedJobs = getInteger();

            System.out.println(find(numberOfJobs, completedJobs));
        }
    }

    String find(int numberOfJobs, int completedJobs)
    {
        int input;

        boolean[] jobs = new boolean[numberOfJobs];

        for (int i = 0; i < completedJobs; i++)
        {
            input = getInteger();
            jobs[input - 1] = true;
        }

        String chef = "";
        String assistance = "";

        int init = 0;

        for (int i = 0; i < numberOfJobs; i++)
        {
            if (!jobs[i])
            {
                if (init % 2 == 0)
                    chef = chef + (i + 1) + " ";
                else
                    assistance = assistance + (i + 1) + " ";
                init++;
            }
        }

        return chef + "\n" + assistance;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
