package practice2;

public class p7 {

	public static void main(String[] args) {
		
		int ID[][] = {{90,80,80},{85,85,95},{95,70,75},{80,80,90},{90,75,80}};
		int sum = 0;
		double average = 0;
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				sum += ID[i][j];
				average = sum/3;
			}
		System.out.println("ID = "+ i +" ÇÕ°è="+ sum +", Æò±Õ="+ average);
		sum = 0;
		average = 0;
		}
	}

}
