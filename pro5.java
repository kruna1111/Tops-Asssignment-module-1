package TopsAssignment;

import java.util.Scanner;

public class pro5 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int sum = 0 ;
		float avg = 0f;
		
		for(int i=1; i<=5; i++)
		{	
			System.out.print("Enter "+i+" Number :");
			int num = sc.nextInt();
			sum=sum+num;
		}
		System.out.println("The Sum Of Five Number Is :- "+sum);
		
		avg=(float)sum/5;
		
		System.out.print("Average Of Given Number Is : "+avg);
		
	}	
	

}
