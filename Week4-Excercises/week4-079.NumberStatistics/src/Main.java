import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenstats = new NumberStatistics();
        NumberStatistics oddstats = new NumberStatistics();
        System.out.println("Type numbers:");

        while (true){
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1){
                break;
            }
            else if (num % 2 == 0){
                evenstats.addNumber(num);
            }
            else if(num % 2 != 0){
                oddstats.addNumber(num);
            }
            stats.addNumber(num);
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenstats.sum());
        System.out.println("sum of odd: " + oddstats.sum());


        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
