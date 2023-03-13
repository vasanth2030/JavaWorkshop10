package basicjava;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Sum: "+sumOfTwoNumbers(a,b));
		System.out.print("Num1: ");
		oddOrEven(a);
		System.out.print("Num2: ");
		oddOrEven(b);
	}
	
	public static int sumOfTwoNumbers(int num1, int num2)
	{
		int sum= num1+num2;
		return sum;
	}
	
	public static void oddOrEven(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
}
