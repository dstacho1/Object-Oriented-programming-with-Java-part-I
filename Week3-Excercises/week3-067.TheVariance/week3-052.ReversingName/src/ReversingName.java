import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int counter = 0;
        int start = -1;
        String reverse = "";

        while (counter < name.length()){
            reverse += name.charAt(name.length() + (start - counter));
            counter ++;
        }

        System.out.println("In reverse order: " + reverse);
    }
}
