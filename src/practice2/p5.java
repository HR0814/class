package practice2;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int grade = sc.nextInt();
		
		if(grade>90)
			System.out.println("학점: A");
		else if(grade>80)
			System.out.println("학점: B");
		else if(grade>70)
			System.out.println("학점: C");
		else if(grade>60)
			System.out.println("학점: D");
		else
			System.out.println("학점: F");
		

	}

}
