
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String message = "icky bob";

        while (true){
            System.out.println("Type the password: ");
            String userInput = reader.nextLine();

            if (userInput.equals(password)){
                System.out.println("Right!");
                System.out.println("");
                System.out.println("The secret is: " + message);
                break;
            }else {
                System.out.println("Wrong!");
            }
        }
    }
}
