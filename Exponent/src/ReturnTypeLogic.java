
public class ReturnTypeLogic {

	int i = 10;
	int j;

	public ReturnTypeLogic m1()

	{
		ReturnTypeLogic r = new ReturnTypeLogic();
		r.i = 100;
		r.j = 90;
		ReturnTypeLogic r5 = new ReturnTypeLogic();
		r5.i = 150;
		r5.j = 0;
		r5.j = 1;
		ReturnTypeLogic r6 = new ReturnTypeLogic();
		r6.j = 900;
		r6.i = 900;
		return r;

	}

	public static void main(String[] args) {

		ReturnTypeLogic r4 = new ReturnTypeLogic();
		ReturnTypeLogic r3 = new ReturnTypeLogic();
		System.out.println(r3.i);// 10
		System.out.println(r3.j);// 0

		ReturnTypeLogic r9 = r4.m1();
		System.out.println(r9.i);// 100
		System.out.println(r9.j);// 90
		
		
		//method - check return type of class and use this object name.
		
	}

}
