package codechef.java;

import java.util.Scanner;

public class GrossSalary {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        GrossSalary grossSalary = new GrossSalary();
        grossSalary.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int basicSalary = getInteger();
            System.out.println(findGrossSalary(basicSalary));
        }
    }

    double findGrossSalary(int basicSalary)
    {
        double hra;
        double da;
        //double grossSalary = 0;

        if (basicSalary < 1500)
        {
            hra = (0.1) * basicSalary;
            da = (0.9) * basicSalary;
        }
        else
        {
            hra = 500;
            da = (0.98) * basicSalary;
        }

        return basicSalary + hra + da;

    }

    int getInteger()
    {
        return sc.nextInt();
    }

}
