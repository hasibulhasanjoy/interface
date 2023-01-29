public class Country implements Measurable {
    private double area;

    public Country(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getMeasure() {
        return area;
    }
}
