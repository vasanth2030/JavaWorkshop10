package basicjava;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
//		while loop
//		int i=1;
//		while(i<=n)
//		{
//			System.out.println("Hello world "+i);
//			i++;
//		}
		
//		do while loop
//		int i=1;
//		do {
//			System.out.println("Hello world "+i);
//			i++;
//		}while(i<=n);
		
//		for loop
		for(int i=1;i<=n;i++)   //(int i=n;i>=1;i--) decrement
		{
			System.out.println("Hello world "+i);
		}
		
		System.out.println("End of program");
	}
}
