package basicjava;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		try {
			div(num1, num2);
			
			// explicitly create an exception
			throw new RuntimeException("Manually thrown exception");
		} 
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception. Enter a non-zero dividend");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured. Inside catch block");
			System.out.println(e);
		}
		finally {
			System.out.println("Inside finally");
		}
		
		System.out.println("End of program");
	}
	
	public static void div(int a, int b) throws ArithmeticException
	{
		int div= a/b;
		System.out.println("Division value: "+div);
	}
}
