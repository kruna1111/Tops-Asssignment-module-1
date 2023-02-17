package TopsAssignment;
abstract class Mark
{
	public abstract void getPercentage();
}
class StdA extends Mark
{
	int sub1,sub2,sub3;
	public StdA(int a, int b, int c) {
		
		sub1=a;
		sub2=b;
		sub3=c;
	}
	
	public void getPercentage() {
		
		float per=(sub1+sub2+sub3)/3f;
		
		System.out.println("The Percentage Of Student A Is :- "+per);
	}
	
}
class StdB extends Mark
{	
	
	int sub1,sub2,sub3,sub4;
	public StdB(int a, int b, int c, int d) {
		
		sub1=a;
		sub2=b;
		sub3=c;
		sub4=d;
	}
	

	@Override
	public void getPercentage() {
		
		float per=(sub1+sub2+sub3+sub4)/4f;
		
		System.out.println("The Percentage Of Student B Is :- "+per);
		
	}
	
}


public class pro31 {
	public static void main(String[] args) {
		
		StdA s1 = new StdA(45, 67, 77);
		s1.getPercentage();
		
		StdB s2 = new StdB(53, 67, 71, 80);
		s2.getPercentage();
	}


}
