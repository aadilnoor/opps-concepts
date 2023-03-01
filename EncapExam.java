class Account
{
private String username;
private String password;
private String name;
private int  age;
private String 	city;

public Account(String username,String password,String name,int age,String city)
{
	this.username=username;
	this.password=password;
	this.name=name;
	this.age=age;
	this.city=city;
}
public String getUsername()
{
	return username;
}
public void setUsername(String username)
{
	this.username=username;
}
public String getPassword()
{
	return password;
}
public void setPassword(String password)
{
	this.password=password;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public int getAge()
{
	return age;
}
public void setAge(int age)
{
	this.age=age;
}
public String getCity()
{
	return city;
}
public void setCity(String city)
{
	this.city=city;
}
}
class EncapExam
{
	public static void main(String[] args) {
		Account ob =new Account("aadil101","Aadil123","Aadil",19,"mumbai");
		System.out.println("UserName :- " +ob.getUsername());
		System.out.println("Pass :- " +ob.getPassword());
		System.out.println("Name :- " +ob.getName());
		System.out.println("Age :- " +ob.getAge());
		System.out.println("City :- " +ob.getCity());

	}
}