import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write your name:");
        String name = reader.nextLine();
        System.out.println("The last character is: " + lastCharacter(name));
    }

    public static char lastCharacter(String name){
        char last = name.charAt(name.length()-1);
        return last;
    }
}
