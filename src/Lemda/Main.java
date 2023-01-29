package Lemda;

public class Main {
    public static void main(String[] args) {
        Measurable m = new BankAccount();
        System.out.println(m.getMeasure(m));
        Measurable n = new BankAccount(2000);
        System.out.println(n.getMeasure(n));
        Measurable amount = (Object o)-> ((BankAccount)o).getBalance();
        System.out.println(amount);
    }
}
