package TopsAssignment;
abstract class Bank
{	
	int a = 100
	,b = 150
	,
	c = 200;
	public abstract void getBalance();
	
	public void msg()
	{
		System.out.println("Welcome To Our Bank");
	}
}

class BankA extends Bank
{

	@Override
	public void getBalance() {
		
		System.out.println("The Balance Of Banck A Is :- "+a+"$");
		
	}
}
class BankB extends Bank
{

	@Override
	public void getBalance() {
		
		System.out.println("The Balance Of Banck B Is :- "+b+"$");
		
	}
}
class BankC extends Bank
{

	@Override
	public void getBalance() {
		
		System.out.println("The Balance Of Banck C Is :- "+c);
		
	}
}


public class pro30 {
	public static void main(String[] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		
		a.msg();
		a.getBalance();
		b.getBalance();
		c.getBalance();
	}
	

}
