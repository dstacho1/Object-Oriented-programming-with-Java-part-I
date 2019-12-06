import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLength = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int counter = 0;
        String password = "";
        while (counter < passLength){
            int temp = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(temp);
            password += symbol;
            counter++;
        }
        return password;
    }
}
