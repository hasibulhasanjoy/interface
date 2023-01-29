package E9;

public class Coin implements Comparable{
    private double value;

    public Coin(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        Coin c = (Coin) o;
        if(value>c.value){
            return 1;
        } else if (value==c.value) {
            return 0;
        }else
            return -1;

    }
}
