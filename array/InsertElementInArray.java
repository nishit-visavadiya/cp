package array;

import java.util.Scanner;

public class InsertElementInArray {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        InsertElementInArray insertElementInArray = new InsertElementInArray();
        insertElementInArray.insertElement();

    }

    void insertElement()
    {
        int sizeOfArray = getInterValue();
        int elementToEnter = getInterValue();
        int position = getInterValue();

        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++)
        {
            array[i] = getInterValue();
        }

        for (int i = array.length-1; i > position - 1; i--)
        {
            array[i] = array[i-1];
        }

        array[position - 1] = elementToEnter;

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }


    int getInterValue()
    {
        return sc.nextInt();
    }

}
