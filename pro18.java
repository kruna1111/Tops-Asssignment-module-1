package TopsAssignment;

import java.util.Scanner;

public class pro18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your String 1 :- ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter Your String 2 :- ");
		String s2 = sc.nextLine();
		
		char w1 = s1.charAt(0);
		char w2 = s1.charAt(1);
		char w3 = s1.charAt(2);
		
		char w1_1 = s2.charAt(0);
		char w2_2 = s2.charAt(1);
		char w3_3 = s2.charAt(2);
		
		if(w1==w1_1 && w2==w2_2 && w3==w3_3)
		{
			System.out.print(w1+", "+w1_1+", "+w2+", "+w2_2+", "+w3+", "+w3_3+"The Three Character Of Given String Are Same");
		}
		else
		{
			System.out.println("The Three Character Of Given String Are Not Same");
		}
	}

}
