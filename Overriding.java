class Test
{
	Object show()
	{
		System.out.println("1");
		return null;
	}
}

class Test2 extends Test
{
	String show()
	{
		System.out.println("2");
		return null;
	}
}
class  Overriding 
{


	public static void main(String[] args)
	 {
		Test2 o = new Test2 ();
		o.show();
		o.show();
	}
}
