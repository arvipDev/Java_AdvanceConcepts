package javagenerics;

public class Main {
    public static void main(String[] args) {

        Team<FootballPlayer> team = new Team<>("Manchester United FC");
        System.out.println("Team: " + team.getTeamName() );
        FootballPlayer vanRoy = new FootballPlayer("Van N Roy", 17, 26);
        FootballPlayer alenS = new FootballPlayer("Alen Shierar", 17, 26);
        FootballPlayer paulS = new FootballPlayer("Paul Scholes", 17, 26);
        FootballPlayer solshae = new FootballPlayer("Sholshea", 17, 26);
        FootballPlayer oliverK = new FootballPlayer("Oliver Khan", 17, 26);
        team.addPlayer(vanRoy);
        team.addPlayer(alenS);
        team.addPlayer(paulS);
        team.addPlayer(solshae);
        team.addPlayer(oliverK);
        System.out.println("------------------------------------------------------------------------");

        Team<HockeyPlayer> team2 = new Team<>("World Hockey Team");
        System.out.println("Team: " + team2.getTeamName() );
        HockeyPlayer piliy = new HockeyPlayer("Danraj Piliy", 8, 36);
        HockeyPlayer bobby = new HockeyPlayer("bobby", 78, 28);
        HockeyPlayer chand = new HockeyPlayer("chand", 55, 22);
        HockeyPlayer allappa = new HockeyPlayer("allappa", 9, 26);
        HockeyPlayer arjun = new HockeyPlayer("arjun", 71, 32);
        HockeyPlayer jugraj = new HockeyPlayer("jugraj", 23, 29);
        team2.addPlayer(piliy);
        team2.addPlayer(bobby);
        team2.addPlayer(bobby);
        team2.addPlayer(chand);
        team2.addPlayer(allappa);
        team2.addPlayer(arjun);
        team2.addPlayer(jugraj);
        System.out.println("------------------------------------------------------------------------");
        Team<FootballPlayer> team3 = new Team<>("Liverpool FC");
        team.matchResult(team3, 5, 8);
        System.out.println(team.compareTo(team3));
        System.out.println("------------------------------------------------------------------------");
        Team<FootballPlayer> team4 = new Team<>("Chelsea FC");
        team4.matchResult(team3, 3, 2);
        Team<FootballPlayer> team5 = new Team<>("New Castle United FC");
        team5.matchResult(team, 1, 0);
        team.matchResult(team5, 1, 1);
        System.out.println("------------------------------------------------------------------------");
        League<Team<FootballPlayer>> league = new League<>("Indian Premier League");
        league.addTeams(team);
        league.addTeams(team3);
        league.addTeams(team4);
        league.addTeams(team5);
        //league.addTeams(team2);
        System.out.println(league.getLeagueName());
        System.out.println("------------------------------------------------------------------------");
        league.showTable();
        System.out.println("------------------------------------------------------------------------");
        // Generic method example
        OtherLeague newLeague = new OtherLeague();
        newLeague.getPlayerNames(team);
        System.out.println("------------------------------------------------------------------------");
        // Multiple generics with inner class example.
        OtherLeague.Think<String, Integer> think = newLeague.new Think<>("Arvind", 29);
        think.print();
        //team.matchResult(team2, 5, 8);

    }
}
