package programs;

import java.util.Scanner;

public class absoluteNumber {
	
	public static void main(String args[]) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the any number");
		a=sc.nextInt();
		if(a<0)
		{
			a=a*(-1);
		}
		//System.out.printf("absolute number is  %d", a);
		System.out.println("absolute number is  " +a);
	}

}
