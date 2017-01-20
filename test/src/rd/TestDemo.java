package rd;

class A
{
	 int a;
	 String s;
	public void m1(){
		System.out.println(a+  "  A CLASS  *********" +s);
	}
	/*A(){
		System.out.println(a+ "*********" +s);
	}*/
	
	A(){
		
	}
}

class B extends A
{
	int a;
	String s;
	B(int a,String s){
		//super(a,s);
		this.a=a;
		this.s=s;
		super.a=a;
		super.s=s;
		//System.out.println(a+ "*********" +s);
	}
	
}
public class TestDemo {	
	public static void main(String[] args) {
		B b = new B(10,"ramesh");
		b.m1();
		//A a1 = new A();
		
	}
}
