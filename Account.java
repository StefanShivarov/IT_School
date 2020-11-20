package zad16;

public class Account {

    private double balance;
    private int id;

    public Account(int id){
        this.id = id;
        this.setBalance(100);
    }

    public int getId() {
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
    public void withdraw(double withdrawMoney){
        this.setBalance(this.getBalance()-withdrawMoney);
    }
    public void deposit(double depositMoney){
        this.setBalance(this.getBalance()+depositMoney);
    }
}
