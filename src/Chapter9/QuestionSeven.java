package Chapter9;

import java.util.Date;

public class QuestionSeven {

    public static void main(String[] args) {

        //Create account and test methods
        Account a1 = new Account(1122, 20000);
        a1.setAnnualInterestRate(4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println(a1.getBalance());
        System.out.println(a1.getMonthlyInterest());
        System.out.println(a1.getDateCreated());

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

    //Need to find the monthly interest rate from the given annual one
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

}
