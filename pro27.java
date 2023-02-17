package TopsAssignment;

import java.util.Scanner;

class tringle
{
	public tringle() {
		tri3side();
		tri4side();
		tri5side();
	}
	
	public void tri3side() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 3 Side Of Tringle ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double perimeter=a+b+c;
		System.out.println();
		System.out.println("Perimeter Of 3 side Tringle "+perimeter);
		 double sp=perimeter/2;
		 double area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		 System.out.println("Area Of Tringle "+area);
	}
	
	public void tri4side() {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter The 4 Side Of Tringle ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		double perimeter=a+b+c+d;
		System.out.println("Perimeter Of 4 Side Tringle "+perimeter);
		
		double l1=(a+b)/2;
		double w1=(c+d)/2;
		
		System.out.println("Area Of 4 Side Tringle "+(l1*w1));
		
	}
	
	public void tri5side() {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter The 5 Side Of Tringle ");
		double a=sc.nextDouble(); //5
		double b=sc.nextDouble(); //4 //8
		double c=sc.nextDouble(); //8 //8
		double d=sc.nextDouble(); //4
		double e=sc.nextDouble(); //5
		
		 double perimeter1=a+c+e;
		 double sp=perimeter1/2;
		 double area1=Math.sqrt(sp*(sp-a)*(sp-c)*(sp-e));
		 //System.out.println(area1);
		 double area2=b*c;
		// System.out.println(area2);
		 System.out.println("Area Of 5 Side Tringle "+(area1+area2));
	}
}

public class pro27 {
	public static void main(String[] args) {
		 tringle t1=new tringle();
	}

}
