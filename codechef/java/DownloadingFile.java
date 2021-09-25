package codechef.java;

import java.util.Scanner;

public class DownloadingFile {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        DownloadingFile downloadingFile = new DownloadingFile();
        downloadingFile.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfTimesHeIsDownloading = getInteger();
            int kMinutes = getInteger();

            System.out.println(totalAmountThatChefHasToPlay(numberOfTimesHeIsDownloading, kMinutes));
        }
    }

    int totalAmountThatChefHasToPlay(int numberOfTimesHeIsDownloading, int kMinutes)
    {
        int totalDollarsThatChefHasToPlay = 0;

        for (int i = 0; i < numberOfTimesHeIsDownloading; i++)
        {
            int time = getInteger();
            int data = getInteger();

            if (time <= kMinutes)
            {
                kMinutes -= time;
            }
            else
            {
                totalDollarsThatChefHasToPlay += (time - kMinutes) * data;
                kMinutes = 0;
            }
        }
        return totalDollarsThatChefHasToPlay;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
