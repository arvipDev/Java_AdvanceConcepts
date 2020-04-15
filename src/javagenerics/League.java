package javagenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class League <T extends  Team> {

    private String leagueName;
    private List<T> leagueTeams = new ArrayList<>();

    League(String leagueName) {
        this.leagueName = leagueName;
    }

    String getLeagueName() {
        return leagueName;
    }

    void addTeams (T team) {
        if(leagueTeams.contains(team)){
            System.out.println("Team is already part of the league");
        } else {
            leagueTeams.add(team);
            System.out.println("Team " + team.getTeamName() + " added to the league");
        }
    }

    void showTable () {
        Collections.sort(leagueTeams);
        for (T team: leagueTeams ) {
            System.out.println(team.getTeamName() + ": " + team.ranking());
        }
    }
}
