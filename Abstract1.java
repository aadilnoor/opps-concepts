abstract class Practice
{
	public abstract void show();
	public abstract void show1();
}
class Practice1 extends Practice
{
	@Override
	public void show()
	{
		System.out.println("method show..");
	}
	public void show1()
	{
		System.out.println("method show1..");
	}
}
class Practice2 extends Practice
{
	@Override
	public void show()
	{
		System.out.println("method show..");
	}
	public void show1()
	{
		System.out.println("method show1..");
	}
}

class Practice3 extends Practice
{
	@Override
	public void show()
	{
		System.out.println("method show..");
	}
	public void show1()
	{
		System.out.println("method show1..");
	}
}
public class Abstract1
{
	public static void main(String[] args) {
		Practice1 obj = new Practice1();
		obj.show();
		obj.show1();
		Practice2 obj2 = new Practice2();
		obj2.show();
		obj2.show1();
		Practice3 obj3 = new Practice3();
		obj3.show();
		obj3.show1();	
	}
}