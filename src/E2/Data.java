package E2;

public class Data {
    public double average(Quizee[] ob){
        double sum = 0;
        for(Quizee e: ob){
            sum = sum + e.getMeasure();
        }
        return sum/ob.length;
    }
    public double highest(Quizee[] obj){
        double max = 0;
        for (Quizee e: obj){
            if(e.getMeasure()>max){
                max = e.getMeasure();
            }
        }
        return  max;
    }
}
