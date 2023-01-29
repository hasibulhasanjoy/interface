package E2;

public class Main {
    public static void main(String[] args) {
        Quizee[] q = new Quizee[3];
        q[0] = new Quizee("A+",83);
        q[1] = new Quizee("A",78);
        q[2] = new Quizee("A-",72);
        Data d = new Data();
        double average = d.average(q);
        System.out.println(average);
        double s = d.highest(q);
        System.out.println(s);
    }
}
