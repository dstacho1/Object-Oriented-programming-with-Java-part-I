import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Who is greeted: ");
        String name = reader.nextLine(); // Reads a line of input from the user and assigns it
        //     to the variable called name

        System.out.println("Hi " + name);
        System.out.print("How old are you " + name);
        int age = Integer.parseInt(reader.nextLine());
        System.out.println(name + " is now " + age);
    }

}
