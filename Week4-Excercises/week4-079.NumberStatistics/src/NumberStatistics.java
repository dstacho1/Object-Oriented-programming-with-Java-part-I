
public class NumberStatistics {
    private int amountOfNumbers;
    private int total;

    public NumberStatistics(){
        this.amountOfNumbers = 0;
        this.total = 0;
    }

    public void addNumber(int number){
        this.amountOfNumbers ++;
        this.total += number;
    }

    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    public int sum(){
        return this.total;
    }

    public double average(){
        if (this.amountOfNumbers == 0){
            return 0;
        }
        return (double)this.sum() / this.amountOfNumbers();
    }


}
