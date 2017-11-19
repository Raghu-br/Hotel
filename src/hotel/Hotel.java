/* 
 
 * To change this license header, choose License Headers in Project Properties. 
 
 * To change this template file, choose Tools | Templates 
 
 * and open the template in the editor. 
 
 */
package hotel;

/** 

 * 

 * @author KrishnaRajput 

 */
import java.util.Scanner; // using scanner class for accept the value by user at run time  

public class Hotel {
	int choice;
	String menu;

	void show() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for Coffee");
		System.out.println("Enter 2 for Tea");
		System.out.println("Enter 3 for Cold Drink");
		choice = s.nextInt();
		if (choice == 1) {
			System.out.println("you have select Coffee");
			System.out.println("menu");
			menu = s.nextLine();
		}
		if (choice == 2) {
			System.out.println("you have select Tea");
			System.out.println("menu");
			menu = s.nextLine();
		}
		if (choice == 3) {
			System.out.println("you have select Cold drink");
			System.out.println("menu");
			menu = s.nextLine();
		}
	}

	/**
	 * 
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Hotel h = new Hotel();
		h.show();
		// TODO code application logic here
	}
}