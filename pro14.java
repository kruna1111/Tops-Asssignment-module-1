package TopsAssignment;

import java.util.Scanner;

public class pro14 {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("Enter String :- ");
		String s = sc.nextLine();
	
		System.out.println(" ");
		
		System.out.print("Enter Index :- ");
		int n = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.print(s.charAt(n));
		
	}

}
