package codechef.java;

import java.util.Scanner;

public class HolesInTheText {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HolesInTheText holesInTheText = new HolesInTheText();
        holesInTheText.execute();
    }

    void execute() {
        int testCases = getInteger();

        while (testCases-- > 0) {
            String word = getString();
            char[] arr = word.toCharArray();
            System.out.println(countHolesInString(arr));
        }
    }

    int countHolesInString(char[] arr) {
        int count = 0;

        for (char letter : arr) {
            if (letter == 'A' || letter == 'D' || letter == 'O' || letter == 'P' || letter == 'R') {
                count++;
            }
            if (letter == 'B') {
                count += 2;
            }
        }

        return count;
    }

    String getString() {
        return sc.next();
    }

    int getInteger() {
        return sc.nextInt();
    }
}
