package E8;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Measure m = new PerimeterMeasure();
        Rectangle[] r = {
                new Rectangle(10,12),
                new Rectangle(5,6),
                new Rectangle(12,9)
        };
        System.out.println(Data.largest(r,m));
    }
}
