package codingbat.array3;

import java.util.Scanner;

public class CanBalance {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CanBalance canBalance = new CanBalance();
        canBalance.execute();
    }

    void execute()
    {
        int[] arr = setArrayValue();
        System.out.println(canBalance(arr));
    }

    private boolean canBalance(int[] nums) {
        int count = 1, flag = 0;
        int sum = 0, sum1 = 0;
        int len = nums.length;

        for (int i = 0; i < count; i++)
        {
            sum += nums[i];
        }

        for (int i = 0; i < len - count; i++)
        {
            sum1 += nums[len - 1 - i];
        }
        if (sum == sum1)
        {
            flag = 1;
        }
        count++;

        if (flag == 1)
            return true;

        return false;
    }

    int[] setArrayValue()
    {
        int sizeOfArray = getInteger();
        int[] arr = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++)
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
