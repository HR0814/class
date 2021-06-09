package practice2;
import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int add, subtract, divide, multiply = 0;
		
		add = num1 + num2;
		subtract = num1 - num2;
		divide = num1 / num2;
		multiply = num1 * num2;
		
		System.out.println(add);
	}

}
