package TopsAssignment;

import java.util.Scanner;

public class pro17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String :- ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter Second String :- ");
		String s2 = sc.nextLine();
		
		int ls1 = s1.length();
		char s1last = s1.charAt(ls1 - 1);
		char s1_last = s1.charAt(ls1 - 2);
		
		int ls2 = s2.length();
		char s2last = s2.charAt(ls2 - 1);
		char s2_last = s2.charAt(ls2 - 2);
		
		System.out.println(" ");
		
		if(s1last == s2last && s1_last == s2_last)
		{
			System.out.print(s1_last+", "+s1last+", "+s2_last+", "+s2last+" "+"Last Tow Character Of Given String Are Same");
		}
		else
		{	
			System.out.print(s1_last+", "+s1last+", "+s2_last+", "+s2last+" "+"Last Two Character Of Given String Are not Same");
		}
		
	}

}
