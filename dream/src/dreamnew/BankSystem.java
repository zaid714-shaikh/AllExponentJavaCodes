package dreamnew;

class Account{
	
	int Totalamt;
	String name;
	
	void insert(int t,String n)
	{
		Totalamt = t;
		name = n;
		
		
	}
	
	public void deposite(int am)
	{
		int amt = am;
		Totalamt = Totalamt + amt; 
		System.out.println("Deposited amount is :- "+amt);
		System.out.println("Total amount after deposite :- "+Totalamt );
	}
	public void withdraw(int w)
	{
		int wit = w;
		Totalamt = Totalamt - w; 
		System.out.println("Withdraw amount is :- "+wit);
		System.out.println("Total amount after Withdraw :- "+Totalamt );

	}
	
	void display()
	{
	   System.out.println("name :- " + name + " Totalamount :- " + Totalamt);		
	}
	
}
public class BankSystem {

	public static void main(String[] args) {
	
		 new BankSystem().add(7, 7); 
		 
		Account a1 = new Account();
		a1.insert(2500, "zaid");
		a1.deposite(2500);
		a1.display();
		a1.withdraw(2500);
		a1.display();

	}
	public int add(int a  , int b)
	{
		 int c= a+b;
		System.out.println("addition is :-"+c);
		return c;
		
	}

}
