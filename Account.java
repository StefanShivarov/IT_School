package zad14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double yearInterestRate;
    private Date dateCreated;

    public Account(){
        this.setId(0);
        this.setBalance(0);
        this.setYearInterestRate(0);
    }

    public Account(int id, double balance){
        new Account();
        this.setId(id);
        this.setBalance(balance);
    }

    public Account(int id, double balance, double yearInterestRate){
        new Account(id, balance);
        this.yearInterestRate = yearInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getYearInterestRate() {
        return yearInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYearInterestRate(double yearInterestRate) {
        this.yearInterestRate = yearInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate(){
        return yearInterestRate/12;
    }

    public double getMonthlyInterest(){
        return this.getBalance()*this.getMonthlyInterestRate()/100;
    }

    public void withdraw(double withdrawMoney){
        this.setBalance(this.getBalance()-withdrawMoney);
    }

    public void deposit(double depositMoney){
        this.setBalance(this.getBalance()+depositMoney);
    }

    @Override
    public String toString(){
        return String.format("Balance: $%.2f%nMonthlyInterest: $%.2f%nDate created: %s", this.getBalance(),
                this.getMonthlyInterest(), this.getDateCreated());
    }
}
