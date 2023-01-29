package E3;

public class Person implements Measure{
    private String name;
    private double height;
    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return height;
    }
}
