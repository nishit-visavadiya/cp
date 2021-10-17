package codechef.java;

import java.util.Scanner;

public class LuckyNumber {

    Scanner scanner = new Scanner(System.in);

    int firstNumberOfLotteryTicket, secondNumberOfLotteryTicket, thirdNumberOfLotteryTicket;

    public static void main(String[] args)
    {
        LuckyNumber luckyNumber = new LuckyNumber();
        luckyNumber.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            firstNumberOfLotteryTicket = getInteger();
            secondNumberOfLotteryTicket = getInteger();
            thirdNumberOfLotteryTicket = getInteger();

            isLotteryTicketHaveLuckyNumberOfChef();
        }
    }

    void isLotteryTicketHaveLuckyNumberOfChef()
    {
        if (isAnyLotteryTicketHaveNumberSeven())
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    boolean isAnyLotteryTicketHaveNumberSeven()
    {
        return firstNumberOfLotteryTicket == 7 || secondNumberOfLotteryTicket == 7 ||
                thirdNumberOfLotteryTicket == 7;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
