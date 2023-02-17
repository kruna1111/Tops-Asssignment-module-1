package TopsAssignment;

import java.util.Scanner;

public class pro37 {
	public static void main(String[] args) {
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number 1 :- ");
			int n1 = sc.nextInt();
			
			System.out.print("Enter Number 2 :- ");
			int n2 = sc.nextInt();
			
			System.out.print("your answer is:- "+(n1/n2));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		
		}
		
	}


}
