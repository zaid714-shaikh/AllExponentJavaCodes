
public class ExceptionHandling  {

	public static void getAge(int a) throws validage {
		if (a > 18) {
			System.out.println("Valid");
		} else {
			throw new validage("not valid");
		}
	}

	public static void main(String[] args) {

		try {
			getAge(18);
		} catch (validage e) {
			
			
			System.out.println(e);
		}
	}
}