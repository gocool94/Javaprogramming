package Encapsulation.BankProblem;

public class Bank {

    // Create fields for the account number, balance, customer name, email and phone number

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    private int AccountNumber;
    private double balance;
    private String CustomerName;
    private String EmailID;
    private int PhoneNumber;


    public double DepositFunds(double deposited_money) {

        return this.balance += deposited_money;
    }

    public double withDrawal(double withdrawalAmount) {

        if(this.balance < withdrawalAmount) {
            System.out.println("your balance is less, You have only "+this.balance+" money in your account");
        } else  {
            this.balance -= withdrawalAmount;
        }

        return this.balance;
    }
}
