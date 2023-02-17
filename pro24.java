package TopsAssignment;
class Perent
{
	public void displayp()
	{
		System.out.println("This Is A Perent Class.....");
	}
}
class Chaild extends Perent
{
	public void displayc()
	{
		System.out.println("This Is A Chaild Class.....");
	}
}

public class pro24 {
	public static void main(String[] args) {
		
		Perent p1 = new Perent();
				p1.displayp();
		
		Chaild c1 = new Chaild();
		c1.displayc();
		c1.displayp();
	}

}
