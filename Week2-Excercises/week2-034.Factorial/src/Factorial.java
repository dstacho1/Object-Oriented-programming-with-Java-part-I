import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int start = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int answer = 1;
        while (counter <= start){
            answer *= counter;
            counter ++;
        }
        System.out.println("Factorial is "+ answer);
    }
}
