package CallBack;

public class Data {
    public double average(Object[] objects, Measurable mss) {
        double sum = 0;
        for (Object e : objects) {
            sum = sum + mss.measure(e);
        }
        return sum/objects.length;
    }
}
