public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        account1.deposit(1000, "checking");
        account1.deposit(500, "savings");
        account1.getBalance();

        // Withdrawal Test
        account2.deposit(2000, "checking");
        account2.withdraw(1500, "checking");
        account2.getBalance();

        // Static Test
        System.out.println("Number of bank accounts: " + BankAccount.getAccounts());
        System.out.println("Total money in all accounts: $" + BankAccount.getTotalMoney());
    }
}


//public class BankTest {
    //public static void main(String[] args){
        // Create 3 bank accounts
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
    //}
//}
