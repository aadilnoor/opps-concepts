import java.util.Scanner;

interface Client
{
	void input();
	void output();
	void pass();
}
class Developer implements Client
{
	 String name;
	 double  sal;
	 int password;

	public void pass()
	{
		  Scanner s = new Scanner(System.in);
		System.out.println("Enter password..");
		password=s.nextInt();

		if(password==2002)
		{
			System.out.println("Client salary is 500000");
		}
		else
		{
			System.out.println("..Wrong Pin..");
		}
	}
	public void input()
	{
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter username : ");
	     name = sc.nextLine();
	     //this.pass();
	}
	public void output()
	{
		System.out.println("..Thank You..");
	}
} 
public class Interface1
{
	public static void main(String[] args) {
		Client ob = new Developer();
		ob.input();
		ob.pass();
		ob.output();
	}
}