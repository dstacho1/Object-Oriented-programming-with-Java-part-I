import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;


    public Team(String teamName){
        this.name = teamName;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player playerName){
        if (size() < this.maxSize){
            this.players.add(playerName);
        }else {
            return;
        }
    }

    public void printPlayers(){
        for (Player playerName:this.players) {
            System.out.println(playerName.toString());
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.players.size();
    }

    public int goals(){
        int teamGoals = 0;
        for (Player player:players) {
            teamGoals += player.goals();
        }
        return teamGoals;
    }
}
