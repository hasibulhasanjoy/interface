package E8;

import java.awt.*;

public class PerimeterMeasure implements Measure{
    @Override
    public double getMeasure(Object obj) {
        Rectangle r = (Rectangle) obj;
        return 2 * (r.getHeight() + r.getWidth());
    }
}
