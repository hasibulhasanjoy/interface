public class BankAccount implements Measurable,Cloneable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
