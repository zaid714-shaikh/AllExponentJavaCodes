package InheritanceProjects;

import java.util.Scanner;

public class Practice {

	static int flag;

	public static void m1() {
		flag = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("--Hi from m1 Method--");
		System.out.println("Enter the First Number :- ");
		int a = sc.nextInt();
		System.out.println("ENter the Second Number :- ");
		int b = sc.nextInt();

		int c = a + b;
		System.out.println("Additon is " + c);

	}

	public static void m1(int i) {
		flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("First Number is :- " + i);
		int a = i;
		System.out.println("Enter the Second Number :- ");
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("Multiplication is " + c);

	}

	public static void main(String[] args) {

		m1(6);
		if (flag == 1) {
			System.out.println("You Call No Parameter m1 Static Method");
		} else {
			System.out.println("You Call Integer Prameter m1 Static Method");
		}
	}
}
