package codechef.java;

import java.util.Scanner;

public class ChefAndColoring {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ChefAndColoring chefAndColoring = new ChefAndColoring();
        chefAndColoring.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfColor = getInteger();
            String color = getString();

            System.out.println(calculateNumberOfColorTOPaint(numberOfColor, color));
        }
    }

    int calculateNumberOfColorTOPaint(int numberOfColors, String color)
    {
        int countRed = 0;
        int countGreen = 0;
        int countBlue = 0;

        for (int i = 0; i < numberOfColors; i++)
        {
            if (color.charAt(i) == 'R')
                countRed++;
            else if (color.charAt(i) == 'G')
                countGreen++;
            else if (color.charAt(i) == 'B')
                countBlue++;
        }
        int value = 0;

        if (countRed >= countGreen && countRed >= countBlue)
        {
            value += countBlue + countGreen;
        }
        else if (countGreen >= countRed && countGreen >= countBlue)
        {
            value += countBlue + countRed;
        }
        else
            value += countGreen + countRed;

        return value;
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
