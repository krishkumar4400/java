
/**
 * Encapsulation
 * 
 * 
Best Practices for Encapsulation
    Always make instance variables private — no exceptions
    Provide getters/setters only when needed — don't blindly create both
    Add validation in setters — protect data integrity
    Return defensive copies for mutable objects (like arrays/collections)
    Make the class public so it's accessible; control access at the field level
 */



class BankAccount {
    // 1. Private instance variables — hidden from outside
    private String accountNumber;
    private double balance;
    private String owner;

    // 2. Constructor to initialize
    public BankAccount(String accountNumber, double initialBalance, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;

          // Validation even in constructor
          if(initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cann't be negative");
          }
        this.balance = initialBalance;
        }

        // 3. Public getter — read-only access
        public double getBalance() {
            return balance;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public String getOwner() {
            return owner;
        }

        // 4. Controlled modification through methods
        public void deposit(double amount) {
            if(amount <= 0) {
                System.out.println("Deposit amount must be positive.");;
                return;
            }
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        }

        public void withDraw(double amount) {
            if(amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
                return;
            }
            if(amount > balance) {
                System.out.println("Insufficient funds!");
                return;
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
    }
}

public class Lecture_11 {

    public static void main(String[] args) {
        BankAccount obj = new BankAccount("123111", 5055, "krish");
        System.out.println(obj.getOwner());
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());
        
        obj.deposit(5);
        System.out.println(obj.getBalance());
        obj.withDraw(60);
        System.out.println(obj.getBalance());
    }    
}