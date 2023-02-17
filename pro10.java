package TopsAssignment;

import java.util.Scanner;

public class pro10
{
	public class Ass10_AsciiValue
	{

		public static void main(String[] args)
		{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Character :- ");
			char ch = sc.next().charAt(0);
			int num = ch;
			System.out.println(" ");
			System.out.print("The ASCII Value of Given "+ch+" Is :- " +num);
			
		}

	}
}
