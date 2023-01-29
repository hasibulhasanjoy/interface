package E8;

public class Data {
    public static Object largest(Object[] obj,Measure mm){
        double max = 0;
        Object m=obj[0];
        for(Object e : obj){
            max = Math.max(max,mm.getMeasure(e));
            if(max<mm.getMeasure(e)){
                m = e;
            }
        }
        return m;
    }
}
