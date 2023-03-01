class Test{
	void show(){
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void show(int x,int y){
		int c;
		c=x+y;
		System.out.println(c);

	}
	void show(int x,float y ){
		float c;
		c=x+y;
		System.out.println(c);

	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.show(20,30);
		t.show(30,30.10f);
	}
}