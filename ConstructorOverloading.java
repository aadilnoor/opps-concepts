class Student
{
	int id;
	String name;

	Student(int a)
	{
		id = a;
		
	}

	Student(int c , String b)
	{
		id=c;
		name=b;
		//System.out.println(id+" "+name);
	}
}


class ConstructorOverloading
{
	public static void main(String[] args) {

		Student sc = new Student(101);
		System.out.println(sc.id);

		Student s = new Student(101,"Aadil");
		System.out.println(s.id+" "+s.name);


	}
	

}