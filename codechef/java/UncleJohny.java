package codechef.java;

import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {

    Scanner sc = new Scanner(System.in);

    int positionOfSongBeforeSorting;

    public static void main(String[] args)
    {
        UncleJohny uncleJohny = new UncleJohny();
        uncleJohny.execute();
    }

    void execute()
    {
        int testCases = getIntegerValue();

        while (testCases --> 0)
        {
            int numberOfSongs = getIntegerValue();

            int[] playlist = getArray(numberOfSongs);
            positionOfSongBeforeSorting = getIntegerValue();

            System.out.println(findTheUncleJohnySongPosition(playlist, positionOfSongBeforeSorting));
        }
    }

    int findTheUncleJohnySongPosition(int[] playlist, int positionOfSongBeforeSorted)
    {
        int positionBeforeSorting = playlist[positionOfSongBeforeSorted - 1];

        Arrays.sort(playlist);

        int positionOfSongAfterSorting = 0;
        for (int i = 1; i <= playlist.length; i++)
        {
            if (playlist[i - 1] == positionBeforeSorting)
            {
                positionOfSongAfterSorting = i;
            }
        }
        return positionOfSongAfterSorting;
    }

    int[] getArray(int sizeOfArray)
    {
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++)
        {
            arr[i] = getIntegerValue();
        }

        return arr;
    }

    int getIntegerValue()
    {
        return sc.nextInt();
    }
}
