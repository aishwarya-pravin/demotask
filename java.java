import java.util.Scanner;

public class Example {	
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		int i, Number; 
		long Fctl = 1;
		sc = new Scanner(System.in);	
		
		System.out.println(" Please Enter any number to Find : ");
		Number = sc.nextInt();
		
		for (i = 1; i <= Number; i++)  {
			Fctl = Fctl * i;
		}
		System.out.format("\nFactorial of %d = %d\n", Number, Fctl);
	}
}