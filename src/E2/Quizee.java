package E2;

public class Quizee implements Measure{
    private String grade;
    private double score;

    public Quizee(String grade, double score) {
        this.grade = grade;
        this.score = score;
    }

    @Override
    public double getMeasure() {
        return score;
    }
}
