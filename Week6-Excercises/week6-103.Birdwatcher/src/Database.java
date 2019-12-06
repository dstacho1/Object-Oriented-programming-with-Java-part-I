import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> database;


    public Database(){
        this.database = new ArrayList<Bird>();
    }

    public void addBird(Bird bird){
        this.database.add(bird);
    }

    public boolean checkBird(String birdname){
        for (Bird bird: database) {
            if (bird.getBirdName().contains(birdname)){
                return true;
            }
        }
        return false;
    }

    public void inceaseBirdSeen(String birdname){
        for (Bird bird:database) {
            if (bird.getBirdName().contains(birdname)){
                bird.inceaseSeen();
            }
        }
    }

    public void print(){
        for (Bird bird:database) {
            System.out.println(bird.toString());
        }
    }

    public void show(String birdToShow){
        for (Bird bird:database) {
            if (bird.getBirdName().contains(birdToShow)){
                System.out.println(bird.toString());
            }
        }
    }
}
