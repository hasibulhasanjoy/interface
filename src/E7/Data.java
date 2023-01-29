package E7;

public class Data {
    public double highest(Object[] obj, Measure mss) {
        double max = 0;
        for (Object e : obj) {
            double m = mss.getMeasure(obj);
            if (m > max) {
                max = m;
            }
        }
        return max;
    }
}
