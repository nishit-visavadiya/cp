package codechef.java;

import java.util.Scanner;

public class ChefAndCookOff {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndCookOff chefAndCookOff = new ChefAndCookOff();
        chefAndCookOff.executeTestCases();
    }

    void executeTestCases()
    {
        int numberOfCompetitors = getInteger();

        while (numberOfCompetitors --> 0)
        {
            int[] progress = getArray(5);

            System.out.println(identifyingTheProgramingLevelOfParticipant(progress));
        }
    }

    String identifyingTheProgramingLevelOfParticipant(int[] progress)
    {
        String result;
        int count = 0;
        for (int i : progress) {
            if (i == 1)
                count++;
        }

        if (count == 0)
            result = "Beginner";
        else if (count == 1)
            result = "Junior Developer";
        else if (count == 2)
            result = "Middle Developer";
        else if (count == 3)
            result = "Senior Developer";
        else if (count == 4)
            result = "Hacker";
        else
            result = "Jeff Dean";

        return result;
    }

    int[] getArray(int size)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = getInteger();
        }

        return arr;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
