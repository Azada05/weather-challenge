
/**
 * This is the main application class of the weather-challenge program. 
 * 
 * @author Azada Henze
 */
public class App {
    
    /**
     *  This is the main entry method of the weather-challenge program.
     */
    
    public static void main(String args[]) {
        //get the day with the least temperature spread
        ProcessWeather weather = new ProcessWeather();
        String dayWithSmallestTempSpread =  weather.ProcessWeather();
        
        //get the team name with the least goal spread
        ProcessFootball football = new ProcessFootball();
        String teamWithSmallestGoalSpread =  football.ProcessFootball();
        
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
