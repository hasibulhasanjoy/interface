package CallBack;

import java.awt.*;

public class AreaRectange implements Measurable{
    @Override
    public double measure(Object obj) {
        Rectangle r = (Rectangle) obj;
        double area = r.getHeight() * r.getWidth();
        return area;
    }
}
