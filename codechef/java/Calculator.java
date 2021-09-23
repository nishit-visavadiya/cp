package codechef.java;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    double a;
    double b;

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        calculator.execute();
    }

    void execute()
    {
        a = getDouble();
        b= getDouble();

        char c = getChar();

        System.out.println(calculate(c));
    }

    double calculate(char c)
    {
        double ans = 0;

        switch (c)
        {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                ans = a / b;
                break;
        }
        return ans;
    }

    char getChar()
    {
        return scanner.next().charAt(0);
    }

    double getDouble()
    {
        return scanner.nextDouble();
    }
}
