import java.util.ArrayList;


//Work out the Mean (the simple average of the numbers)
//Then for each number: subtract the Mean and square the result (the squared difference).
//Then work out the average of those squared differences. (Why Square?)

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        Integer sum = 0;
        for (Integer num:list) {
            sum+=num;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        Integer total = sum(list);
        double avg = (double)total/list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        double mean = average(list);
        Integer size = list.size();
        double differences = 0.00;
        for (Integer number:list) {
            differences += Math.pow((number-mean), 2);
        }
        return differences / (size-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
