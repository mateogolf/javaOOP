import java.util.*;
public class BankAccount{
    // The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    // Create a class member (static) that has the number of accounts created thus far.
    public static int counter;
    // Create a class member (static) that tracks the total amount of money stored in every account created.
    public static double totalBalance;
    // Create a private method that returns a random ten digit account number.
    private String genAccountNumber(){
        char[] digits = "0123456789".toCharArray();
        String result = "";
        Random r = new Random();
        for(int i=0;i<10;i++){
            result += digits[r.nextInt(digits.length)];
        }
        return result;

    }
    // In the constructor, call the private method from above so that each user has a random ten digit account.
    public BankAccount(){
        this(0,0);
    }
    public BankAccount(double checking,double savings){
        accountNumber = genAccountNumber();
        checkingBalance = checking;
        savingsBalance = savings;
        totalBalance += checking + savings;
        counter++;// In the constructor, be sure to increment the account count.
    }
    

    // Create a getter method for the user's checking account balance.
    public double getCheckingBalance(){
        return checkingBalance;
    }

    // Create a getter method for the user's saving account balance.
    public double getSavingsBalance(){
        return savingsBalance;
    }

    // Create a method that will allow a user to deposit money into either the checkings or savings, be sure to add to total amount stored.
    public void depositChecking(double deposit){
        checkingBalance += deposit;
        totalBalance += deposit;
    }
    public void depositSavings(double deposit){
        savingsBalance += deposit;
        totalBalance += deposit;
    }

    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawChecking(double withdraw){
        if(withdraw > checkingBalance){
            System.out.println("Insufficient Funds");
            return;
        }
        checkingBalance -= withdraw;
        totalBalance -= withdraw;
    }
    public void withdrawSavings(double withdraw){
        if(withdraw > savingsBalance){
            System.out.println("Insufficient Funds");
            return;
        }
        savingsBalance -= withdraw;
        totalBalance -= withdraw;
    }

    // Create a method to see the total money from the checkings and savings.
    public double accountTotal(){
        return checkingBalance + savingsBalance;
    }

    // Users should not be able to set any of the attributes from the class.==>private variable
    public void displayAccount(){
        System.out.println("Account#: " + accountNumber);
        System.out.println("Checking Balance: " + checkingBalance);
        System.out.println("savings Balance: " + savingsBalance);
    }
}