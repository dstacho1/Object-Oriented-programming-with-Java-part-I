
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Is the number between 5-10?");
        int number = 7;

        if (number > 4 && number < 11) {
            System.out.println("Yes! :)");
        } else {
            System.out.println("Nope :(");
        }

    }
}
