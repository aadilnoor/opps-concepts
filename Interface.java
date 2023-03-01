interface Student
{
	int rollNo = 10;
	String name = "sam";

	//void showData(); 
	void showDetails(); 
}
class Marksheet implements Student
{
	/*@Override
	public void showData()
	{
		System.out.println("implements of show methods..");
	}*/
	@Override
	public void showDetails()
	{
		System.out.println("Roll no :- "+ rollNo  +"\nName of Student :- " +name );
	}
}

public class Interface
{
	public static void main(String[] args) {
		Marksheet m= new Marksheet();
	//	m.showData();
		m.showDetails();
	}
	
}