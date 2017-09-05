public class BankAccountTest{
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
        BankAccount account2= new BankAccount(1500.00,7500);
        BankAccount account3= new BankAccount();
        System.out.println(BankAccount.counter);
        System.out.println(account2.getCheckingBalance());
        System.out.println(account2.getSavingsBalance());
        System.out.println(account2.accountTotal());
        // account1.displayAccount();
        account2.displayAccount();
        account1.depositChecking(100);
        account1.depositSavings(100);
        // account3.displayAccount();
        account1.withdrawChecking(250);
        account1.withdrawSavings(250);
        account2.withdrawChecking(250);
        account2.withdrawSavings(250);
        System.out.println(account2.accountTotal());
        System.out.println(BankAccount.totalBalance);
        // System.out.println(account2.accountNumber); Check
    }
}