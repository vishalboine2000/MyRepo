package inheritance;

public class Parent {
	
	Parent()
	{
		System.out.println("Parent Constructor");
	}	
	
	void method(int x) {
		System.out.println("Parent value is "+x);
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	void method() {
		System.out.println("Child method is called");
	}
		public static void main(String[] args) {
			Child c=new Child();
			c.method();
			c.method(100);
		}
	}
