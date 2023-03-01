                                                             /*Encapsulation*/

class Encap{
	private String value;  // hiding data 

	public void setValue(String x)  // data abstraction
	{
		value=x;
	}
	public String getValue()
	{
		return value;
	}
}

class Encapsule{
	public static void main(String[] args) {
		Encap ob = new Encap();
		ob.setValue("Aadil");
		System.out.println(ob.getValue());
	}
}