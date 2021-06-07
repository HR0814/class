package practice2;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		
		int n;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter line number: ");
		n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<i;j++) {
				System.out.println("*");
				System.out.println("");
			}
			System.out.println("*");
			System.out.println("\n");
		}


	}

}
