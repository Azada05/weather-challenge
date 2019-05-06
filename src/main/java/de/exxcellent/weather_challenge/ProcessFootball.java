import java.util.ArrayList;
import java.util.List;
import java.lang.Math; 

/**
 * ProcessFootball take in football data -> creates Team Objects -> Stores in Array -> Iterates over the array 
 * -> finds goal differences -> outputs the name of the team with the least temperature difference.
 * @author Azada Henze
 */

public class ProcessFootball {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int goalDiff;
    private int minGoalDiff;
    private String teamWithSmallestGoalSpread;
    
    public String ProcessFootball() {
        // Instanzvariable initialisieren
        goalDiff = 0;
        minGoalDiff = 0;
        teamWithSmallestGoalSpread = "";
        List<Team> teamList = new ArrayList<Team>();
        DataReader data = new DataReader();
        List<String[]> footballDetails = data.readData("input/football.csv"); // get data from data reader
        //create Day objects and store in a list
        for ( String []  footballDetail : footballDetails) {
            Team team = new Team(footballDetail[0],
            Integer.parseInt(footballDetail[5]), Integer.parseInt(footballDetail[6]));
            teamList.add(team);
        }
        for (Team t : teamList) {
            goalDiff = Math.abs(t.getGoals() - t.getGoalsAllowed());
            if (minGoalDiff == 0) {
                minGoalDiff = goalDiff;
           }
           if (goalDiff < minGoalDiff){
               minGoalDiff = goalDiff;
               teamWithSmallestGoalSpread = t.getTeamName();
           }
        }
        return teamWithSmallestGoalSpread;
    }
}
