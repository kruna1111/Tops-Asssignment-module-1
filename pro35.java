package TopsAssignment;
class ShapeAB
{
	public void displayS()
	{
		System.out.println("This Is Shape ");
	}
}
class CircleAB extends ShapeAB
{
	public void displayc()
	{
		System.out.println("This Is Circle");
	}
}
class RectengleAB extends ShapeAB
{
	public void displayR()
	{
		System.out.println("This Is Rectengle");
	}
}
class Square extends RectengleAB
{
	public void displayS()
	{
		System.out.println("Squer Is Rectengle");
	}
}


public class pro35 {
	public static void main(String[] args) {
		
		Square s1 = new Square();
		s1.displayS();
		s1.displayR();
	}
	

}
