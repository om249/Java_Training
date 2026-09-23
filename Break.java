package Introduction;

import java.util.*;

class CreateAcc {
	void display(String Name, String Surname) {
		System.out.println("Name : " + Name);
		System.out.println("Surname : " + Surname);
	}

}

public class Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
		int choice = 0;

		System.out.print("Enter your 4-digit PIN: ");
		int Pin = sc.nextInt();
		int correctPin = Pin;

		while (choice != 5) {

			System.out.println("\n===== ATM Menu =====");
			System.out.println("1. Create Account");
			System.out.println("2. Check Balance");
			System.out.println("3. Deposit Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. Exit");
			System.out.print("Choose an option (1-4): ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				CreateAcc ac = new CreateAcc();
				System.out.println("Enter your Pin:");
				int pin = sc.nextInt();
				if (pin != correctPin) {
					System.out.println("Incorrect PIN! Access denied.");
					break;
				}
				System.out.print("Enter Your Name : ");
				String name = sc.next();
				System.out.print("Enter Your Surname : ");
				String surname = sc.next();
				ac.display(name, surname);
				break;

			case 2:
				System.out.println("Check Balance");
				break;
			case 3:
				System.out.println("Deposite Money");
				break;
			case 4:
				System.out.println("Withdraw Money");
				break;
			case 5:
				System.out.println("Logout...");
				break;
			default:
				System.out.println("Sai...");

			}
		}

	}
}
