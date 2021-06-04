package practice2;

public class p3 {

	public static void main(String[] args) {

		int a=0;
		for(int i=1;i<10;i++) {
			
			System.out.println("**구구단"+i+"단**");
			
			for(int j=1;j<10;j++) {
				a=i*j;
				System.out.println(i+" X "+j+" = "+a);
			}
			System.out.println("\n");
		}
	}

}
