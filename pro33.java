package TopsAssignment;
abstract class Shape
{
	public abstract void RectangleArea(int l, int b);
	public abstract void SquareArea(int s);
	public abstract void CircleArea(int r);
	
}
class Area extends Shape
{

	public void RectangleArea(int l, int b) {
		
		System.out.println("The Area Of Rectangle Is :- "+(l*b));
		
	}

	@Override
	public void SquareArea(int s) {
		
		System.out.println("The Are Of Squer Is :- "+(s*s));
		
	}

	@Override
	public void CircleArea(int c) {
		final double p = 3.14159265359f; 
		float r = (float)(c/(2*p));
		System.out.println("The Area Of Circle Is :- "+r);
	}
	
}


public class pro33 {
	public static void main(String[] args) {
		
		Area a = new Area();
		a.RectangleArea(30, 40);
		a.SquareArea(50);
		a.CircleArea(20);
	}


}
