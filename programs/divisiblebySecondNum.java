package programs;

import java.util.Scanner;

public class divisiblebySecondNum {
	public static void main(String args[]) {
		int a;
		int b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a%b==0)
		{
			System.out.println("Given number is divisible");
		}
		else
		{
			System.out.println("Given number is not divisible");
		}
	}

}
