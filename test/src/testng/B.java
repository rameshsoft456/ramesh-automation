package testng;



public class B extends A
{
	public void m1() {
		System.out.println("m1 method");
		System.out.println("driver value is : " +driver);

	}
	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
	}
}


