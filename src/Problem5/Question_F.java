//Create a simple Java program to create a banking application in which the user deposits 
//BDT 1000 and begins withdrawing BDT 500, BDT 400, and then encounters an exception 
//with the message "Not Sufficient Fund" when the user withdraws BDT 300.
package Problem5;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: BDT " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: BDT " + amount);
        } else {
            throw new InsufficientFundsException("Not Sufficient Fund");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Question_F {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        account.deposit(1000.0);
        try {
            account.withdraw(500.0);
            account.withdraw(400.0);
            account.withdraw(300.0);  // This will trigger an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Final Balance: BDT " + account.getBalance());
    }
}

