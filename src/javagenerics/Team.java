package javagenerics;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player> implements Comparable<Team<T>> {

    private List<T> teamMembers = new ArrayList<>();
    private String teamName;
    private int loss = 0;
    private int won = 0;
    private int draw = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public boolean addPlayer (T player) {
        if(teamMembers.contains(player)){
            System.out.println("Player already in the team.");
            return false;
        }
        teamMembers.add(player);
        System.out.println( player.getName() + " added to the team " + teamName);
        return true;
    }

    public void matchResult (Team<T> team, int ourScore, int oppScore) {
        if (ourScore < oppScore) {
            loss++;
            team.won++;
            System.out.println("Lost");
        } else if (ourScore > oppScore) {
            won++;
            team.loss++;
            System.out.println("Won");
        } else {
            draw++;
            team.draw++;
            System.out.println("Draw");
        }
    }

    public int ranking() {
        return (won*2) + draw;
    }

    @Override
    public int compareTo(Team<T> team) {
        int temp;
        if (this.ranking() > team.ranking()){
            temp = this.ranking() - team.ranking();
            //System.out.println(this.teamName + " leads " + team.getTeamName() + " by " + temp );
            return -1;
        } else if (this.ranking() < team.ranking()){
            temp = team.ranking() - this.ranking();
            //System.out.println(this.teamName + " trails " + team.getTeamName() + " by " + temp );
            return 1;
        } else
            //System.out.println("both teams rank the same " + team.ranking());
        return 0;
    }

    public String getTeamName () {
        return this.teamName;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}
