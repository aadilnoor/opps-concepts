 abstract class Programing
{
	public abstract void developer();
	public abstract void Rank();
}

class Html extends Programing
{
	@Override
	public void developer()
	{
		System.out.println("Tim Berners Lee..");
	}
	@Override
	public void Rank()
	{
		System.out.println("Rank..2");
	}
}

class Java extends Programing
{
	@Override
	public void developer()
	{
		System.out.println("James Gosling..");
	}
	@Override
	public void Rank()
	{
		System.out.println("Rank..1");
	}
}

 class Abstract2
 {
 	public static void main(String[] args) {
 		Html h = new Html();
 		h.developer(); h.Rank();
 		Java j = new Java();
 		j.developer(); j.Rank();
 		

 	}
 }