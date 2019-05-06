import java.util.ArrayList;
import java.util.List;

/**
 * ProcessWeather take in weather data -> creates Day Objects -> Stores in Array -> Iterates over the array 
 * -> Finds temperature differences -> Outputs the day id with the least temperature difference.
 * @author Azada Henze
 */

public class ProcessWeather
{
    // Declare class variables
    private int tempDiff;
    private int minTempDiff;
    private String dayWithSmallestTempSpread;
    
    public String ProcessWeather() {
        // Initialize variables
        tempDiff = 0;
        minTempDiff = 0;
        dayWithSmallestTempSpread = "";
        //initialize a list to hold day objects
        List<Day> dayList = new ArrayList<Day>();
        //get the data from the datareader class
        DataReader data = new DataReader();
        List<String[]> weatherDetails = data.readData("input/weather.csv"); // get data from data reader
        //create Day objects and store in THE LIST
        for ( String []  weatherDetail : weatherDetails) {
            Day day = new Day(weatherDetail[0],
            Integer.parseInt(weatherDetail[1]), Integer.parseInt(weatherDetail[2]));
            dayList.add(day);
        }
        //for each day object calculate the temperature difference and update the minimum temperature difference if its bigger than the current temeperature difference
        for (Day d : dayList) {
            tempDiff = d.getMxT() - d.getMnT();
            //assign the first temperature difference
            if (minTempDiff == 0) {
                minTempDiff = tempDiff;
           }
           if (tempDiff < minTempDiff){
               minTempDiff = tempDiff;
               //get the day number of the least temperature spread
               dayWithSmallestTempSpread = d.getDayId();
           }
        }
        return dayWithSmallestTempSpread;
    }
}
