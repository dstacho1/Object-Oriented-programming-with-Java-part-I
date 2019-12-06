
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a name:");
        int len = calculateCharacters(reader.nextLine());
        // call your method from here
        System.out.println("Number of characters: " + len);
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String someString){
        return someString.length();
    }
    
}
