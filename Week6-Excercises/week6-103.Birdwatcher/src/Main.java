import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        Scanner reader = new Scanner(System.in);

        Database database = new Database();

        //Bird test = new Bird("Seagul", "Sandy boy");
        while (true){
            System.out.print("? ");
            String userInput = reader.nextLine();
            if (userInput.equals("Quit")){
                break;
            }
            else if (userInput.equals("Add")){
                System.out.print("Name: ");
                String birdname = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinname = reader.nextLine();
                Bird addedBird = makeBird(birdname, latinname);
                database.addBird(addedBird);
            }
            else if (userInput.equals("Observation")){
                System.out.print("What was observed:? ");
                String observedBird = reader.nextLine();
                if (database.checkBird(observedBird)){
                    database.inceaseBirdSeen(observedBird);
                }else {
                    System.out.println("Is not a bird!");
                }

            }
            else if (userInput.equals("Statistics")){
                database.print();
            }
            else if (userInput.equals("Show")){
                System.out.print("What? ");
                String birdToShow = reader.nextLine();
                database.show(birdToShow);
            }
        }
    }

    public static Bird makeBird(String birdName, String latinName){
        Bird bird = new Bird(birdName, latinName);
        return bird;
    }





}
