package practice2;
import java.util.Scanner;

public class printstars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		if (count < 1) {
			System.out.println("[E] Not enough stars");
			return;
		}

		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}

			System.out.println();
		}

	}

}
