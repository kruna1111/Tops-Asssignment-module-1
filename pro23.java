package TopsAssignment;
class Squer
{
	public void area(int a, int b)
	{
		System.out.println("The Area Of Rectengle Is :- "+(a*b));
	}
	
	public void area(int a)
	{
		System.out.println("The Area Of Squer Is :- "+(a*a));
	}
}


public class pro23 {
public static void main(String[] args) {
	
		
		Squer s = new Squer();
		s.area(20);
		s.area(50, 10);
	}
	
	
}
