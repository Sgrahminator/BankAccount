import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney;
    private String accountNumber;

    // Constructor
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
        totalMoney = checkingBalance + savingsBalance;
        this.accountNumber = generateAccountNumber();
    }

    // Getter methods
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // Deposit method
    public void deposit(double amount, String accountType) {
        if (amount > 0) {
            if (accountType.equals("checking")) {
                checkingBalance += amount;
            } else if (accountType.equals("savings")) {
                savingsBalance += amount;
            }
            totalMoney += amount;
            System.out.println("Deposited $" + amount + " into " + accountType + " account.");
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    // Withdrawal method
    public void withdraw(double amount, String accountType) {
        if (amount > 0) {
            if (accountType.equals("checking")) {
                if (checkingBalance >= amount) {
                    checkingBalance -= amount;
                    totalMoney -= amount;
                    System.out.println("Withdrew $" + amount + " from checking account.");
                } else {
                    System.out.println("Insufficient funds in checking account.");
                }
            } else if (accountType.equals("savings")) {
                if (savingsBalance >= amount) {
                    savingsBalance -= amount;
                    totalMoney -= amount;
                    System.out.println("Withdrew $" + amount + " from savings account.");
                } else {
                    System.out.println("Insufficient funds in savings account.");
                }
            }
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    // Get balance method
    public void getBalance() {
        System.out.println("Checking balance: $" + checkingBalance);
        System.out.println("Savings balance: $" + savingsBalance);
        System.out.println("Total balance: $" + totalMoney);
    }

    // Generate random ten-digit account number
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}


//public class BankAccount {
    // MEMBER VARIABLES
    //private double checkingBalance;
    //private double savingsBalance;
    //private static int accounts;
    //private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
//}
