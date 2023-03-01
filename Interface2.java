interface A
{
	 public void show();
}
interface B
{
	public void show1();
}
interface C                           /* extends A,B*/
{
	public void show2();
}
 public class Interface2 implements A,B,C
{
    @Override
	public void show()
	{
		System.out.println("show method ");
	}
	@Override
	public void show1()
	{
		System.out.println("show1 method ");
	}
	@Override
	public void show2()
	{
		System.out.println("show2 method");
	}
	public static void main(String[] args) {
		Interface2 ob = new Interface2();
		ob.show();
		ob.show1();
		ob.show2();
	}
}