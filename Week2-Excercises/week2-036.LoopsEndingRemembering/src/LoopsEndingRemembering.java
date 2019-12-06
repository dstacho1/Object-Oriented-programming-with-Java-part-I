import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int evens = 0;
        int odds = 0;

        System.out.println("Type numbers:");
        while(true){
            int num = Integer.parseInt(reader.nextLine());

            if (num == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + ((double)sum/count));
                System.out.println("Even numbers: " + evens);
                System.out.println("Odd numbers: " + odds);
                break;
            }

            if (num % 2 == 0){
                evens ++;
            } else {
                odds ++;
            }

            sum += num;
            count ++;

        }
    }
}
