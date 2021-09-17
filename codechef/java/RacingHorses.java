package codechef.java;

import java.util.Arrays;
import java.util.Scanner;

public class RacingHorses {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        RacingHorses racingHorses = new RacingHorses();
        racingHorses.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfHorses = getInteger();

            int[] listOfHorses = getArray(numberOfHorses);
            System.out.println(minimumDifferenceBetweenHorses(listOfHorses, numberOfHorses));
        }
    }

    int minimumDifferenceBetweenHorses(int[] listOfHorses, int numberOfHorses)
    {
        Arrays.sort(listOfHorses);

        int minimumNumberOfSkills = listOfHorses[1] - listOfHorses[0];

        for (int i = 1; i < numberOfHorses - 1; i++)
        {
            minimumNumberOfSkills = Math.min(minimumNumberOfSkills, listOfHorses[i + 1] - listOfHorses[i]);
        }

        return minimumNumberOfSkills;
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
