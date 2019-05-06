import java.util.ArrayList;
import java.util.List;
import java.lang.Math; 

/**
 * ProcessFootball take in football data -> creates Team Objects -> Stores in Array -> Iterates over the array 
 * -> finds goal differences -> outputs the name of the team with the least temperature difference.
 * @author Azada Henze
 */

public class ProcessFootball {
    // IDeclare the properties of processing football class
    private int goalDiff;
    private int minGoalDiff;
    private String teamWithSmallestGoalSpread;
    
    public String ProcessFootball() {
        // initialize the 
        goalDiff = 0;
        minGoalDiff = 0;
        teamWithSmallestGoalSpread = "";
        //create a list to store football objects
        List<Team> teamList = new ArrayList<Team>();
        // get data from data reader
        DataReader data = new DataReader();
        List<String[]> footballDetails = data.readData("input/football.csv"); 
        //create team objects and store in a list
        for ( String []  footballDetail : footballDetails) {
            Team team = new Team(footballDetail[0],
            Integer.parseInt(footballDetail[5]), Integer.parseInt(footballDetail[6]));
            teamList.add(team);
        }
        //for each team object calculate the goal difference and update the minimum goal difference if its bigger than the current goal difference
        for (Team t : teamList) {
            //calculate the absolute goal difference
            goalDiff = Math.abs(t.getGoals() - t.getGoalsAllowed());
            if (minGoalDiff == 0) {
                minGoalDiff = goalDiff;
           }
           if (goalDiff < minGoalDiff){
               minGoalDiff = goalDiff;
               //get the name of the team with the least range in goal difference
               teamWithSmallestGoalSpread = t.getTeamName();
           }
        }
        return teamWithSmallestGoalSpread;
    }
}
