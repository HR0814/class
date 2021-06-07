package practice2;

import java.util.Arrays;

public class p6 {

	public static void main(String[] args) {
		
		int grade[] = {90,75,85,95,70,75,85,85,95,72};
		int sum = 0;
		double average = 0;
		
		for(int i=0;i<10;i++) {
			sum += grade[i];
		}
		average = sum/10;
		
		System.out.println("Á¡¼ö: "+ Arrays.toString(grade));
		System.out.println("ÇÕ°è: " + sum);
		System.out.println("¼š±Õ: " + average);
	}

}
