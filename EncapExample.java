                                                  /* Encapsulation*/
 class Student
{
	private int rollno;
	private String name;
	private String course;

	public int getRollno()
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
	public String getCourse()
	{
		return course;

	}
	public void setRollno(int x)
	{
		rollno=x;
	}
	public void setName(String x)
	{
		name=x;
	}
	public void setCourse(String x)
	{
		course=x;
	}
}                                                   
class EncapExample{
	public static void main(String[] args) {
		Student ob = new Student();
		ob.setRollno(101);
		ob.setName("Aadil");
		ob.setCourse("BCA");
		System.out.println("Rollno:- " +ob.getRollno());
		System.out.println("Name:- " +ob.getName());
		System.out.println("Course:- " +ob.getCourse());
	}
}