public class StaticnonStatic {
	
	int i =1;
	String name="zaid"; 
	
	
	static {
		System.out.println("----------------------Upto date programme---------------");
		System.out.println("****these is the static block executes before main method****");
		System.out.println();
		StaticnonStatic s3 = new StaticnonStatic();
		System.out.println(s3.i);
		System.out.println(s3.name);
		;	
	
	}
	
	{
		System.out.println("****these is the non static block executes along with Constructor ****");
	}
	
	public StaticnonStatic() {
		
		System.out.println("Hi Iam Defualt Constructor");
	}
	
	public static void main(String[] args) {
		StaticnonStatic s = new StaticnonStatic();
		DataTypes d  =new DataTypes();
		d.show();
		System.out.println();
		StaticnonStatic s1 = new StaticnonStatic();

		
	}

}
