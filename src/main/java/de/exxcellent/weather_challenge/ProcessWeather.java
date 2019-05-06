import java.util.ArrayList;
import java.util.List;

/**
 * ProcessWeather take in weather data -> creates Day Objects -> Stores in Array -> Iterates over the array 
 * -> finds temperature differences -> outputs the day id with the least temperature difference.
 * @author Azada Henze
 */

public class ProcessWeather
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int tempDiff;
    private int minTempDiff;
    private String dayWithSmallestTempSpread;
    
    public String ProcessWeather() {
        // Instanzvariable initialisieren
        tempDiff = 0;
        minTempDiff = 0;
        dayWithSmallestTempSpread = "";
        List<Day> dayList = new ArrayList<Day>();
        DataReader data = new DataReader();
        List<String[]> weatherDetails = data.getDataArray(); // get data from data reader
        //create Day objects and store in a list
        for ( String []  weatherDetail : weatherDetails) {
            Day day = new Day(weatherDetail[0],
            Integer.parseInt(weatherDetail[1]), Integer.parseInt(weatherDetail[2]));
            dayList.add(day);
        }
        for (Day d : dayList) {
            int mxT = d.getMxT();
            int mnT = d.getMnT();
            tempDiff = getTempDiff(mxT, mnT);
            if (minTempDiff == 0) {
                minTempDiff = tempDiff;
           }
           if (tempDiff < minTempDiff){
               tempDiff = minTempDiff;
               dayWithSmallestTempSpread = d.getDayId();
           }
        }
     System.out.println("This is dayWithSmallestTempSpread" + dayWithSmallestTempSpread);   
     return dayWithSmallestTempSpread;
    }
    public int getTempDiff(int Mxt, int MnT) {
        return Mxt - MnT;    
    }
}
