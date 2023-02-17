package TopsAssignment;

import java.util.Scanner;

class Fect
{
	public void fectorial(int no)
	{
		int f = 1;
		for(int i=1; i<=no; i++)
		{
			f = f*i;
		}
		System.out.print("Factorial Of Given Number Is :- "+f);
	}
}


public class pro32 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number For Fectorial :- ");
		int n = sc.nextInt();
		
		Fect f1 = new Fect();
		f1.fectorial(n);
	}
	

}
