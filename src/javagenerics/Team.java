package javagenerics;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player> implements Comparable<Team<T>> {

    private List<T> teamMembers = new ArrayList<>();
    private String teamName;
    private int loss = 0;
    private int won = 0;
    private int draw = 0;

    Team(String teamName) {
        this.teamName = teamName;
    }

    void addPlayer (T player) {
        if(teamMembers.contains(player)){
            System.out.println("Player already in the team.");
        } else
        teamMembers.add(player);
        System.out.println( player.getName() + " added to the team " + teamName);
    }

    void matchResult (Team<T> team, int ourScore, int oppScore) {
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

    int ranking() {
        return (won*2) + draw;
    }

    @Override
    public int compareTo(Team<T> team) {
        int temp;
        if (this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() < team.ranking()){
            return 1;
        } else
            System.out.println("both teams rank the same " + team.ranking());
        return 0;
    }

    String getTeamName () {
        return this.teamName;
    }

    void getTeamMemberNames () {
        for (Player player: teamMembers) {
            System.out.println("Name " + player.getName());
        }
    }
}
