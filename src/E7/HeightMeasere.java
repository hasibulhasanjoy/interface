package E7;

public class HeightMeasere implements Measure{
    @Override
    public double getMeasure(Object obj) {
        Person p = (Person) obj;
        return p.getHeight();
    }
}
