package codechef.java;

import java.util.Scanner;

public class GradeTheSteel {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        GradeTheSteel gradeTheSteel = new GradeTheSteel();
        gradeTheSteel.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int h = getInteger();
            float c = getFloat();
            int s = getInteger();

            System.out.println(getGradesOfSteel(h, c, s));
        }
    }

    int getGradesOfSteel(int hardness, float carbon, int strength)
    {
        if (hardness > 50 && carbon < 0.7 && strength > 5600)
        {
            return 10;
        }
        else if (hardness > 50 && carbon < 0.7)
        {
            return 9;
        }
        else if (carbon < 0.7 && strength > 5600)
        {
            return 8;
        }
        else if (hardness > 50 && strength > 5600)
        {
            return 7;
        }
        else if (hardness > 50 || carbon < 0.7 || strength > 5600)
        {
            return 6;
        }
        else
        {
            return 5;
        }
    }

    int getInteger()
    {
        return sc.nextInt();
    }

    float getFloat()
    {
        return sc.nextFloat();
    }
}
