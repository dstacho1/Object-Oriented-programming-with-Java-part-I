import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Your first character is: " + firstCharacter(name));
    }

    public static char firstCharacter(String name){
        char first = name.charAt(0);
        return first;
    }

}
