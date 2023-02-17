package TopsAssignment;

public class pro38 {
public static void main(String[] args) {
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			
			int ab[] =new int[5];
			ab[5]=6;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		
	}
	

}
