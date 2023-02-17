package TopsAssignment;
class Member
{
	int Data_Member = 1
	   ,Age = 26
	   ,Salary = 70111;
	long Phone_Number = 999999; 
	
	String Name = "krunal",
		   Address ="Gunjan Vapi";
	
	public void printSalary()
	{
		System.out.println("Data Member  :- "+Data_Member);
		System.out.println("Name Of Data Member :- "+Name);
		System.out.println("Age Of Data Member :- "+Age);
		System.out.println("Salary Of Data Member  :- "+Salary);
		System.out.println("Phone Number Of Data Member:- "+Phone_Number);
		System.out.println("Address Of  Data Member:- "+Address);
	}
}


public class pro25 {
public static void main(String[] args) {
		
		Member m = new Member();
		m.printSalary();
				
	}

}
