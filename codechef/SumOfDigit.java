package codechef;

import java.util.*;

public class SumOfDigit {

	void sumOfDigit(){
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int sum = 0;

			while (n > 0) {
				sum += n % 10;
				n /= 10;

			}
			System.out.println(sum);
		}

		sc.close();
	}

}