package codechef;

import java.util.*;

public class Intest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			
			long t=sc.nextLong();
			
			if (t%k==0) {
				total++;
			}else {
				total=total;
			}
		}
		System.out.println(total);
		
		sc.close();
	}

}
