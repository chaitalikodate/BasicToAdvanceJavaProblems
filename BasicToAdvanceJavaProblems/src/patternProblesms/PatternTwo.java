package patternProblesms;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m and n");
		int n = sc.nextInt();
		int m = sc.nextInt();
		//from where this logic comes means i have to check i and j value by keeping them in 
		//matrix form
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= m; j++) {
				if (i == 2 || j == 2 || i == n || j == m) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}

	}

}
