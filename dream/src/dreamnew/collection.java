package dreamnew;

import java.util.LinkedList;
import java.util.Scanner;

public class collection {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int n=0;
		    LinkedList<String> l = new LinkedList<String>();
		    while (true) {
		      System.out.println("1.Enter the Elements:-");
		      System.out.println("2.Insert the Elements:-");
		      System.out.println("3.Delete the Elements:-");
		      System.out.println("Enter your choice:-");
		      int ch = sc.nextInt();
		      switch (ch) {
		        case 1:
		          System.out.print("Put How many Elements In list:-");
		          n = sc.nextInt();

		          for (int i = 0; i < n; i++) {

		            System.out.print("Enter the name " + i + " :- ");
		            String name = sc.next();
		            l.add(i, name);
		          }
		          break;
		        case 2:
		          System.out.print("Enter the place you want to put name :-");
		          int pos = sc.nextInt();

		          for (int k = 0; k <= n; k++) {
		            if (pos == k) {
		              System.out.print("Enter the name :-");
		              String name1 = sc.next();
		              l.add(k, name1);
		            }

		          }
		          System.out.print("Elements are:- " + l);
		          break;
		        case 3:
		          // Deleting Elements from LinkedList

		          System.out.print("Which one you want to delete enter pos:-");
		          int d = sc.nextInt();
		          for (int j = 0; j <= n; j++) {
		            if (d == j) {
		              l.remove(d);
		            }

		          }
		          System.out.print("After removing :- " + l);
		          break;
		      }

		    }

	}

}
