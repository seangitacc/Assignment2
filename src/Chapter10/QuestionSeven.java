package Chapter10;

import java.util.Date;
import java.util.Scanner;

public class QuestionSeven {

    public static void main(String[] args) {

        //Create ten accounts with a balance of 100
        Account[] arrOfAccounts = new Account[10];
        for(int i = 0; i < arrOfAccounts.length; i++){
            arrOfAccounts[i] = new Account(i, 100);
        }

        //Ask the user for an id (0 - 9)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an id: ");
        int id = input.nextInt();
        while (id < 0 || id > 9){
            System.out.print("Incorrect id. Try again: ");
            id = input.nextInt();
        }

        //Let the user choose an option and then perform a function based on that input
        int option = 0;
        while(option != 4){

            System.out.println("Main menu \n" +
                    "1: Check Balance \n" +
                    "2: Withdraw \n" +
                    "3: Deposit \n" +
                    "4: Exit");
            System.out.print("Enter a choice: ");
            option = input.nextInt();

            switch(option){
                case 1:
                    System.out.println("The balance is " + arrOfAccounts[id].getBalance());
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    int withdraw = input.nextInt();
                    arrOfAccounts[id].withdraw(withdraw);
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    int deposit = input.nextInt();
                    arrOfAccounts[id].deposit(deposit);
                    break;
                case 4:
                    System.out.print("Enter an id: ");
                    id = input.nextInt();
                    while (id < 0 || id > 9){
                        System.out.print("Incorrect id. Try again: ");
                        id = input.nextInt();
                    }

                    option = 0;
                    break;
                default:
                    System.out.print("Invalid input. Try again: ");
            }

        }

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

    /**
     * Find the monthly interest from the given annual interest
     * @return monthly interest
     */
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