package com.Exponent.SetterGetter;

public class Demo {

	

	public static void main(String[] args) {
		
		
		SetterGetter sg = new SetterGetter();
		sg.setAdd("pune");
		sg.setName("zaid");
		sg.setId(4);
		sg.setNumber(65742365784l);
		System.out.println(sg.getAdd()+sg.getId()+sg.getName()+sg.getNumber());
	}
}
