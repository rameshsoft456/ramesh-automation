package rd;

class B1
{
	public void m1() {
		System.out.println("m1 parent");

	}
	public void m1(int a) {
		System.out.println("m1 parent");

	}
	/*public void m1(float a) {
		System.out.println("m1 parent");

	}
	public void m1(double d) {
		System.out.println("m1 parent");

	}*/
}

class C1 extends B1
{
	/*public void m1() {
		System.out.println("m1 child");

	}*/
	
	public void m1(int a) {
		System.out.println("m1 child");

	}
	public void m1(char a) {
		System.out.println("m1 child");

	}
}

public class A1 {

	public static void main(String[] args) {
		
		/*B1 b1 = new B1();
		b1.m1();
		
		
		C1 c1 = new C1();
		c1.m1();
		c1.m1(10);*/
		
		B1 b = new C1();
		b.m1();	
		b.m1(10);
		
	}
	
	
}
