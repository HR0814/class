package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class p9_1 {

	public static void main(String[] args) {

		int data1[] = {80,90,95,75,70};
		int data2[] = {90,85,85,85,80};
		int sum_a = 0;
		int sum_b = 0;
		
		for(int i=0;i<5;i++) {
			sum_a += data1[i];
			sum_b += data2[i];
		}
		System.out.println("A: " + Arrays.toString(data1));
		System.out.println("Sum(A) = " + sum_a);
		System.out.println("B: " + Arrays.toString(data2));
		System.out.println("Sum(B) = " + sum_b);
		
	}

}
