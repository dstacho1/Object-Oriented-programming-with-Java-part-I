public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        String star = "";
        while (amount >= 1){
            star += "*";
            amount --;
        }
        System.out.println(star);
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int len = sideSize;
        while (sideSize >= 1){
            printStars(len);
            sideSize --;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        while(height >= 1){
            printStars(width);
            height --;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int start = 1;
        while (start <= size){
            printStars(start);
            start ++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
