package Exponent.Polymorphisam.MethodOverriding;

public class B extends A{

	static
    {
        System.out.println('D');
    }
 
    {
        System.out.println('E');
    }
 
    public B()
    {
        System.out.println('F');
    }
	
	public static void main(String[] args) {
		
		
		B b = new B();
		
	}
}
