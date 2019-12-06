
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("Add a temparature to be graphed: ");
            double number = Double.parseDouble(reader.nextLine());

            if (number == 0.5){
                break;
            }else if (number < -30 || number > 40){
                System.out.println(number + " will be ignored");
            }else{
                Graph.addNumber(number);
            }
        }
    }
}
