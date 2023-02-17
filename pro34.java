package TopsAssignment;

import java.util.Scanner;

class Stdmark
{
	public void setMark(int m)
	{
		if(m>=0 && m<=100)
		{
			if(m>=91 && m<=100)
			{
				System.out.println("Your Grade Is :- AA");
			}
			else if(m>=81 && m<=95)
			{
				System.out.println("Your Grade Is :- AB");
			}
			else if(m>=71 && m<90)
			{
				System.out.println("Your Grade:- BB");
			}
			else if(m>=61 && m<=80)
			{
				System.out.println("Your Grade:- BC");
			}
			else if(m>=51 && m<=70)
			{
				System.out.println("Your Grade:- CD");
			}
			else if(m>=40 && m<=60)
			{
				System.out.println("Your Grade:- DD");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		else
		{
			System.out.println("Plese Entered Correct Marks");
		}
	}
	
}

public class pro34 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Mark :- ");
		int m = sc.nextInt();
		
		Stdmark m1 = new Stdmark();
		m1.setMark(m);
		
		
	}
	

}
