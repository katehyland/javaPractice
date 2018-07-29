package thisAFolder;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter your age");
		int age = in.nextInt();
		
		if (age >= 21) {
			System.out.println("You are old enough to drink");
		}
		else {
			System.out.println("You are not old enough to drink. Go get a fake ID.");
		}

	}

}
