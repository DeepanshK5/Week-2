package encapsulationandpolymorphism.bankingsystem;

import encapsulationandpolymorphism.bankingsystem.BankAccount;
import encapsulationandpolymorphism.bankingsystem.CurrentAccount;
import encapsulationandpolymorphism.bankingsystem.Loanable;
import encapsulationandpolymorphism.bankingsystem.SavingsAccount;

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        // Creating account objects
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "Alice", 10000, 4);
        CurrentAccount currentAccount = new CurrentAccount("CA456", "Bob", 5000, 2000);

        // Storing accounts in an array
        BankAccount[] accounts = {savingsAccount, currentAccount};

        System.out.println("Account Details and Calculations:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayDetails();

            double interest = accounts[i].calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (accounts[i] instanceof Loanable) {
                Loanable loanable = (Loanable) accounts[i];
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(20000); // Example loan application
            }

            if (accounts[i] instanceof CurrentAccount) {
                ((CurrentAccount) accounts[i]).displayOverdraftDetails();
            }

            System.out.println("----------------------------");
        }
    }
}
