package E3;

public class Main {
    public static void main(String[] args) {
        Person[] m = new Person[3];
        m[0] = new Person("hasibul",150);
        m[1] = new Person("hasan",151);
        m[2] = new Person("joy",149);
//        Data d = new Data();
        System.out.println(Data.average(m));
        System.out.println(Data.tallest(m));
    }
}
