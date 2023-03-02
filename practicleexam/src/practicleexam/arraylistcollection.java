package practicleexam;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class arraylistcollection {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of items:-");
	int n  = sc.nextInt();
   Hashtable<String,Long> h = new Hashtable<String,Long>();
   for(int i=0;i<n;i++)
   {
	   System.out.println("Enter the name:-");
	   String name =sc.next();
	   System.out.println("enter the number:-");
	   long no=sc.nextLong(); 
	   h.put(name, no);
	  
	   System.out.println(name);
	   System.out.println(no);
   }
  
	}

}
