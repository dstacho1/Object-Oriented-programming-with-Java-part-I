public class Bird {
    private String birdName;
    private String latinName;
    private int seenAmount;

    public Bird(String birdName, String latinName){
        this.birdName = birdName;
        this.latinName = latinName;
        this.seenAmount = 0;
    }

    public String toString(){
        return this.birdName + " (" + this.latinName + "): " + this.seenAmount + " observations";
    }

    public String getBirdName(){
        return this.birdName;
    }

    public void inceaseSeen(){
        this.seenAmount++;
    }
}
