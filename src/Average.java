public class Average {
    public static double getAverage(BankAccount[] obj) {
        double sum = 0;
        for (BankAccount e : obj) {
            sum = sum + e.getBalance();
        }
        return sum / obj.length;
    }

    public static double getAverageArea(Country[] obj) {
        double sum = 0;
        for (Country e : obj) {
            sum = sum + e.getArea();
        }
        return sum / obj.length;
    }

    public static double average(Measurable[] obj) {
        double sum = 0;
        for (Measurable e : obj) {
            sum = sum + e.getMeasure();
        }
        return sum / obj.length;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        BankAccount[] b = new BankAccount[4];
        b[0] = new BankAccount(1000);
        b[1] = new BankAccount(1100);
        b[2] = new BankAccount(1200);
        b[3] = new BankAccount(1300);
        System.out.println(getAverage(b));
        Country[] c = new Country[4];
        c[0] = new Country(100);
        c[1] = new Country(200);
        c[2] = new Country(300);
        c[3] = new Country(400);
        System.out.println(getAverageArea(c));
        System.out.println(average(b));
        System.out.println(average(c));
        BankAccount bb = b[0];
        bb.deposit(100);
        System.out.println(bb.getBalance());
        System.out.println(b[0].getBalance());
        BankAccount cln = (BankAccount) bb.clone();
        System.out.println(cln.getBalance());
        bb.deposit(100);
        System.out.println(cln.getBalance());
        System.out.println(bb.getBalance());
        System.out.println(b[0].getBalance());
    }
}
