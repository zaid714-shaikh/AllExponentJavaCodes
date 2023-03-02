import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calulator Using While loop");

		System.out.println("Enter the First Number :- ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number :- ");
		int b = sc.nextInt();

		int s = 1;
		while (s <= 3) {
			System.out.println("***1.Addition***");
			System.out.println("***2.Substraction***");
			System.out.println("***3.Multiplication***");
			System.out.println("***4.Division***");
			System.out.println("Enter your choice");
			int n = sc.nextInt();

			switch (n) {
			case 1:

				System.out.println("The Addition is " + (a + b));

				break;

			case 2:

				System.out.println("The Substraction " + (a - b));
				break;
			case 3:

				System.out.println("The Multiplication " + (a * b));
				break;

			case 4:

				System.out.println("The Diviosion " + (a / b));
				break;
			default:
				System.out.println("Invalid Operation");
				break;
			}
			s++;
		}
	}

}
