abstract class Animal
{
	Animal()
	{
		System.out.println("All");
	}
	public abstract void sound();
}
class Dog extends Animal
{
	Dog()
	{
		super();
	}
	
	public void sound()
	{
		System.out.println("Dog is barking");
	}
}
class Lion extends Animal
{
	public void sound()
	{
		System.out.println("Lion is Roar");
	}
}
class Abstract
{
	public static void main(String[] args) {
		Dog ob = new Dog();
		Lion l =new Lion();
		ob.sound();
		 l.sound();
	}
}