import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] array){
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array){
        int[] reverseCopy = new int[array.length];
        for (int i = array.length; i >= 1; i--){
            System.out.println(i);
            reverseCopy[Math.abs(i - array.length)] = array[i-1];
        }
        return reverseCopy;
    }
}
