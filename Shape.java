class Demo
{
	void draw()
	{
	System.out.println("hi");
	}
}
class Circle extends Demo
{
	@Override
	void draw()
	{
		super.draw();
		System.out.println("by");
	}
	 
}
class Shape
{
	 public static void main(String[] args) {
	 	Circle ob = new Circle();
	 	ob.draw();

	 }
}