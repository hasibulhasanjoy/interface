package E7;


public class Main {
    public static void main(String[] args) {
        Measure m = new HeightMeasere();
        Person[] p = {
                new Person("Hasibul", 150),
                new Person("hasan", 151),
                new Person("Joy", 149)
        };
        Data d = new Data();
        System.out.println(d.highest(p,m));
    }
}
