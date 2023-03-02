package com.Exponent.ExceptionHandling.TryCatch;

public class Example2 {
	int age;

	public void setAge(int a) {

	}

	public static void main(String[] args) {
		Example2 e1 = new Example2();

		System.out.println("Main Method");
		try {
			int i[] = new int[-9];// negativearrayexception
			Object a[] = new Double[2];// arraystoreexception
			a[1] = new Integer(4);

		} catch (NegativeArraySizeException | ArrayStoreException e) {

			System.out.println(e);
		}

	}
}
