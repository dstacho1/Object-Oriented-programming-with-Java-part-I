
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int r = Integer.parseInt(reader.nextLine());

        System.out.print("Circumference of the circle: " + (2 * r * Math.PI));
    }
}
