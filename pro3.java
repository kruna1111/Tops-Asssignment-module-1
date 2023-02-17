package TopsAssignment;

import java.util.Scanner;

public class pro3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Year : ");
		int y = sc.nextInt();
		
		if( y % 4 == 0)
		{
			System.out.print("This "+y+" Is Leep Year");
		}
		else
		{
			System.out.print("This "+y+" Not Leep Year");
		}
		
		
	}

}
