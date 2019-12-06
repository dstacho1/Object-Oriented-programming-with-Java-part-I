import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
        //this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
        //this.starsInLastPrint = 0;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        //this.starsInLastPrint = 0;
    }

    public void printLine(){
        Random random = new Random();
        for (int i = 0; i < this.width; i++ ){
            if (this.density > random.nextDouble()){
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print(){
        starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++){
            printLine();
        }
    }

    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}
