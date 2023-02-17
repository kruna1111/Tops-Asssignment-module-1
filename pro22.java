package TopsAssignment;
class Assign
{
	public void method1(int n , char c)
	{
		System.out.println("Its First Method");
		System.out.print("Integer Number Is :- "+n);
		System.out.println(" ");
		System.out.print("Character Is :- "+c);
		System.out.println(" ");
	}
	
	public void method1(char c , int n)
	{
		System.out.println("Its Second Method");
		System.out.print("Character Is :- "+c);
		System.out.println(" ");
		System.out.print("Integer Number Is :- "+n);
		
	}
}

public class pro22 {
	

	public static void main(String[] args) {
		
		Assign a1 = new Assign();
		a1.method1(10, 'k');
		a1.method1('k', 10);
	}


}
