package TopsAssignment;

import java.util.Scanner;

public class pro19 {
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Your String 1 :- ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter Your String 2 :- ");
		String s2 = sc.nextLine();
		

		char s1w1 = s1.charAt(0);
		char s1w2 = s1.charAt(1);
		
		char s2w1 = s2.charAt(0);
		char s2w2 = s2.charAt(1);
		
		
		System.out.println(s2w1+" "+s1w1+" "+s2w2+" "+s1w2);//y w z x
		System.out.println(s1w1+" "+s2w1+" "+s2w2+" "+s1w2);//w y z x
		System.out.println(s2w1+" "+s1w1+" "+s1w2+" "+s2w2);//y w x z
		System.out.println(s1w1+" "+s1w2+" "+s2w1+" "+s2w2);//w x y z
		System.out.println(s2w1+" "+s2w2+" "+s1w1+" "+s1w2);//y z w x
		System.out.println(s1w1+" "+s2w1+" "+s1w2+" "+s2w2);//w y x z
		
		}

}
