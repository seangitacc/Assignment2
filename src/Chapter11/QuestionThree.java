package Chapter11;

import java.util.Date;

public class QuestionThree {

    public static void main(String[] args) {

        //Create a new account of each type
        Account a1 = new Account(1, 100);
        SavingsAccount sa1 = new SavingsAccount(2, 100);
        CheckingAccount ca1 = new CheckingAccount(3, 100);

        //Withdraw money from the savings and checking to test functions
        sa1.withdraw(99);
        ca1.withdraw(135, 34);

        //Print out the account's information
        System.out.println(a1.toString());
        System.out.println(sa1.toString());
        System.out.println(ca1.toString());



    }

}

class Account{

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){

    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double number){
        this.balance = balance - number;
    }

    public void deposit(double number){
        this.balance =  balance + number;
    }

    public String getAccountType() { return "Account"; }

    /**
     * Override the toString method
     * @return account information
     */
    public String toString(){

        return "Account summary\n" +
                "Account Type: " + getAccountType() + "\n" +
                "Date created: " + getDateCreated() + "\n" +
                "Balance: " + getBalance() + "\n" +
                "Annual interest rate: " + getAnnualInterestRate();

    }

}

class SavingsAccount extends Account{

    public SavingsAccount() {

    }

    public SavingsAccount(int id, double balance){
        super(id, balance);
    }

    /**
     * Withdraw, but you cannot have a negative balance with a savings account
     * @param number
     */
    public void withdraw(double number){

        if((getBalance() - number) < 0){
            System.out.println("You cannot have a negative balance. Your current balance is " + getBalance());
        }else{
            double balance = getBalance() - number;
            setBalance(balance);
        }

    }

    public String getAccountType() { return "SavingsAccount"; }

    /**
     * Override the toString method
     * @return account information
     */
    public String toString(){

        return "Account summary\n" +
                "Account Type: " + getAccountType() + "\n" +
                "Date created: " + getDateCreated() + "\n" +
                "Balance: " + getBalance() + "\n" +
                "Annual interest rate: " + getAnnualInterestRate();

    }

}

class CheckingAccount extends Account{

    public CheckingAccount() {

    }

    public CheckingAccount(int id, double balance){
        super(id, balance);
    }

    /**
     * Withdraw, but you can overdraft up to limit
     * @param number
     * @param limit
     */
    public void withdraw(double number, double limit){

        if((getBalance() - number) < 0 && (getBalance() - number) <= (-limit)){
            System.out.println("You have exceeded your overdraft limit. Your current balance is " + getBalance());
        }else{
            double balance = getBalance() - number;
            setBalance(balance);
        }

    }

    public String getAccountType() { return "CheckingAccount"; }

    /**
     * Override the toString method
     * @return account information
     */
    public String toString(){

        return "Account summary\n" +
                "Account Type: " + getAccountType() + "\n" +
                "Date created: " + getDateCreated() + "\n" +
                "Balance: " + getBalance() + "\n" +
                "Annual interest rate: " + getAnnualInterestRate();

    }

}