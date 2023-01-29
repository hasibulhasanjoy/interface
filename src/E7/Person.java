package E7;

public class Person{
    private String name;
    private double height;
    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
//    @Override
//    public double getMeasure(Object obj) {
//        Person p = (Person) obj;
//        return p.height;
//    }
}
