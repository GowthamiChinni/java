package programs;

import java.util.Scanner;

public class positiveOrNegative {
	public static void main(String args[]) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		a=sc.nextInt();
		
		if(a>=0)
		{
			System.out.println("number is positive" );
		}
		else
		{
			System.out.println("number is negative" );
		}
	}

}
