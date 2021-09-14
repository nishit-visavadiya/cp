package codechef.java;


import java.util.Scanner;

public class Mahasena {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mahasena mahasena = new Mahasena();
        mahasena.execute();
    }

    void execute() {
        int n = getInteger();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = getInteger();
        }
        System.out.println(battle(n, arr));

    }

    String battle(int numberOfSoldiers, int[] arr) {
        int readyBattleCount = 0;
        int notReadyBattleCount = 0;
        String result;

        for (int i = 0; i < numberOfSoldiers; i++) {
            if (arr[i] % 2 == 0)
                readyBattleCount++;
            else
                notReadyBattleCount++;
        }

        if (readyBattleCount > notReadyBattleCount)
            result = "READY FOR BATTLE";
        else
            result = "NOT READY";

        return result;
    }

    int getInteger() {
        return sc.nextInt();
    }

}
