package E3;

import E2.Main;

public class Data {
    public static double average(Measure[] obj) {
        double sum = 0;
        for(Measure e: obj){
            sum = sum + e.getMeasure();
        }
        return sum/obj.length;
    }
    public static String tallest(Person[] obj){
        double max = 0;
        String name  = "";
        for(Person e: obj){
            if(max<e.getMeasure()){
                max = e.getMeasure();
                name = e.getName();
            }
        }
        return  name;
    }
}
