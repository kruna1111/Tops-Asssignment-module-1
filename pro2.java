package TopsAssignment;

import java.util.Scanner;

public class pro2 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter An Alphabet :- ");
		
		String c = sc.nextLine();
		int l = c.length();
		
		if(l==1)
		{
			//boolean  a = c.matches("[a-zA-Z]");
			char b = c.charAt(0);
			
			if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U')
			{
				System.out.print("Enter Character "+b+" is Volwel");
				System.out.println(" ");
			}
			else
			{
				System.out.print("Enter Character "+b+" is Consonant");
				System.out.println(" ");
			}
		}
			else
			{
				System.out.print("Not An Alphabet");
			}
		}
		}
		
	



