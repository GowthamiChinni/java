package programs;

import java.util.Scanner;

public class UserGivenEvenNums {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
			int n = sc.nextInt();
			for(int i=6;i<=n;i=i+2) {
			
			System.out.println(+i);
			sc.close();

		}
	}

}
