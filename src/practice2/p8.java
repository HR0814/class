package practice2;

import java.util.Arrays;

public class p8 {

	public static void main(String[] args) {

		String word = "Hello, World";
		char ch[] = word.toCharArray();
		System.out.println(ch);
		
		for(int j=0;j<=11;j++) {
			
			int i = ch[j];
					
			if(97 <= i && i <=122) {
				i = i-32;
				char a = (char)i;
				System.out.println(a);

			}
			else if(65 <= i && i <=90){
				i = i+32;
				char b = (char)i;
				System.out.println(b);

			}
			else {
				char c = (char)i;
				System.out.println(c);
			}			
		}		

		
	}

}
