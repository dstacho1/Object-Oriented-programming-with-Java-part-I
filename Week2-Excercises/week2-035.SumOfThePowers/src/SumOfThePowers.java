
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int max = Integer.parseInt(reader.nextLine());
        int counter = 0;
        int answer = 0;

        while (counter <= max){
            answer = answer + (int)Math.pow(2,counter);
            counter ++;

        }
        System.out.println("The result is " + answer);
    }
}
