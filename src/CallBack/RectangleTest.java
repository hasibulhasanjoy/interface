package CallBack;

import java.awt.*;

public class RectangleTest {
    public static void main(String[] args) {
        Measurable m = new AreaRectange();
        Rectangle[] r = {
                new Rectangle(5,5,10,7),
                new Rectangle(5,5,12,10),
                new Rectangle(6,6,7,6)
        };
        Data d = new Data();
        double avArea = d.average(r,m);
        System.out.println(avArea);
        Measurable mm = (Object obj)-> {
            Rectangle rr = (Rectangle) obj;
            return  rr.getWidth() * rr.getHeight();
        };
        System.out.println(mm);
    }
}
