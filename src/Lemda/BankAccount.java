package Lemda;

public class BankAccount implements Measurable{
    private double balance;

    public BankAccount() {
        balance = 1000;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getMeasure(Object anObj) {
        return balance;
    }
}
