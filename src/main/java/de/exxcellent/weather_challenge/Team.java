import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
/**
 * Class to create objects of Team
 * 
 * @author (Azada Henze)
 */
public class Team
{
    // Deklaration der Variablen
    private String teamName;
    private int goals;
    private int goalsAllowed;

    public Team(String teamName, int goals, int goalsAllowed)
    {
        // Instanzvariable initialisieren
        super();
        this.teamName = teamName; 
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
    }

    public String getTeamName()
    {
        return teamName;
    }
    public int getGoals()
    {
        return goals;
    }
    public int getGoalsAllowed()
    {
    return goalsAllowed;     
    }
}
    
