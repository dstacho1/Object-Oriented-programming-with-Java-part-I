public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }

    public void next(){
        if (value + 1 > upperLimit){
            this.value = 0;
        } else {
            value++;
        }
    }

    public String toString(){
        if (value < 10){
            return " 0" + value;
        }
        return "" + value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue){
        if (newValue>=0 && newValue<=this.upperLimit){
            this.value = newValue;
        }
    }
}
