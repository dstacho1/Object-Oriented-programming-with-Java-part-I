
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int counter = Integer.parseInt(reader.nextLine());
        int num = 1;
        while(counter >= num){
            System.out.println(num);
            num++;
        }
        
    }
}
