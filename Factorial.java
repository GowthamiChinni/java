package programs;

public class Factorial {
	public static void main(String argas[]) {
		int i,n,fact=1;
		n= 5;
		for(i=1;i<=n;i++)
		{
		fact = fact *i;	
		}
		System.out.println("Factorial of"+n+"is" +fact);
	}

}
