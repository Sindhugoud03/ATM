import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        
        double bankBalance = 5000.0; 
        int pin = 1234; 
        boolean exit = false; 

                Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        
           
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Change PIN");
            System.out.println("E. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.next(); 
            
            switch (choice) {
                case "1": 
                    System.out.println("Your current balance is: " + bankBalance);
                    break;

                case "2": 
                    System.out.print("Enter your PIN: ");
                    int enteredPin = scanner.nextInt();

                    if (enteredPin == pin) { 
                        System.out.print("Enter the amount to withdraw: ₹");
                        double amount = scanner.nextDouble();

                        if (amount > bankBalance) { 
                            System.out.println("Insufficient balance. Transaction failed.");
                        } else {
                            bankBalance -= amount; 
                            System.out.println("Please collect your cash.");
                            System.out.println("Remaining balance: " + bankBalance);
                        }
                    } else {
                        System.out.println("Incorrect PIN. Transaction canceled.");
                    }
                    break;

                case "3": 
                    System.out.print("Enter your current PIN: ");
                    enteredPin = scanner.nextInt();

                    if (enteredPin == pin) { 
                        System.out.print("Enter your new PIN: ");
                        int newPin = scanner.nextInt();
                        pin = newPin; 
                        System.out.println("PIN changed successfully.");
                    } else {
                        System.out.println("Incorrect PIN. PIN change failed.");
                    }
                    break;

                case "4":
    
                
                
                          exit = true; 
                    System.out.println("Thank you !");
                    break;

                default: 
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        
    }

    

