package codechef.java;

import java.util.Scanner;

public class CopsAndThief {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CopsAndThief copsAndThief = new CopsAndThief();
        copsAndThief.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int houses = getInteger();
            int coverHousesPerMinutes = getInteger();
            int coverMaximumHouses = getInteger();

            int[] cops = getArray(houses);

            System.out.println(housesToHide(houses, coverHousesPerMinutes, coverMaximumHouses, cops));
        }
    }

    int housesToHide(int houses, int coverHousesPerMinutes, int coverMaximumHouses, int[] cops)
    {
        int count = 0;
        int distance = distanceThatCopsCoversInMinutes(coverHousesPerMinutes, coverMaximumHouses);

        for (int i = 1; i <= 100; i++)
        {
            boolean safe = true;
            for (int j = 0; j < houses; j++)
            {
                int leftHouse = cops[j] - distance;
                int rightHouse = cops[j] + distance;

                if (i >= leftHouse && i <= rightHouse)
                    safe = false;
            }

            if (safe)
                count++;
        }
        return count;
    }

    int distanceThatCopsCoversInMinutes(int coverHousesPerMinutes, int coverMaximumHouses)
    {
        return coverHousesPerMinutes * coverMaximumHouses;
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
