package practice2;
import java.util.Scanner;

public class p10 {

	public static double add(int x, int y) {
		return x + y;
	}
	public static double subtract(int x, int y) {
		return x - y;
	}
	public static double divide(int x, int y) {
		return x / y;
	}
	public static double multiply(int x, int y) {
		if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		else return x * y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		char ch = sc.next().charAt(0);
		int b = sc.nextInt();
		double result = 0;
		
		if(ch == '+')
		{
			result = add(a,b);
		}
		else if (ch == '-')
		{
			result = subtract(a,b);
		}
		else if (ch == '/')
		{
			result = divide(a,b);
		}
		else
		{
			result = multiply(a,b);
		}
							
		System.out.println(" = "+result);
						
	}

}
