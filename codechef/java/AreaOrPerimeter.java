package codechef.java;

import java.util.Scanner;

public class AreaOrPerimeter {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        AreaOrPerimeter areaOrPerimeter = new AreaOrPerimeter();
        areaOrPerimeter.execute();
    }

    void execute()
    {
        int length = getInteger();
        int width = getInteger();

        if (calculateArea(length, width) > calculatePerimeter(length, width))
        {
            System.out.println("Area");
            System.out.println(calculateArea(length, width));
        }

        if (calculatePerimeter(length, width) > calculateArea(length, width))
        {
            System.out.println("Peri");
            System.out.println(calculatePerimeter(length, width));
        }

        if (calculatePerimeter(length, width) == calculateArea(length, width))
        {
            System.out.println("Eq");
            System.out.println(calculatePerimeter(length, width));
        }

    }

    int calculateArea(int length, int width)
    {
        return length * width;
    }

    int calculatePerimeter(int length, int width)
    {
        return 2 * (length + width);
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
