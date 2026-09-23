package Introduction;

import java.util.Scanner;

public class Break1 {
    public static void main(String[] args) {
        // Initialize balance and PIN
        double balance = 1000.00;
        int correctPin = 1234;
        
        Scanner scanner = new Scanner(System.in);
        
        // Simple PIN authentication
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = scanner.nextInt();
        
        if (enteredPin != correctPin) {
            System.out.println("Incorrect PIN! Access denied.");
            scanner.close();
            return;
        }
        
        int choice;
        
        // ATM Menu Loop
        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: $%.2f\n", balance);
                    break;
                    
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited $%.2f\n", depositAmount);
                        System.out.printf("New Balance: $%.2f\n", balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("Successfully withdrew $%.2f\n", withdrawAmount);
                        System.out.printf("Remaining Balance: $%.2f\n", balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient funds!");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please select between 1 and 4.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
