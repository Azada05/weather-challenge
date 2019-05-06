/** Class Day initialized object Day with properties: DayId, Maximum Temperature and Minimum Temperature
 * 
 */

public class Day
{
    // Declare variables/properties of day object
    private String dayId;
    private int mxT;
    private int mnT;

    /**
     * Constructor for Objects Class Day
     */
    public Day(String dayId, int mxT, int mnT) {
        // initialize the variables
        super();
        this.dayId = dayId;
        this.mxT = mxT;
        this.mnT = mnT;
    }
    
    public String getDayId() { 
        return dayId;
    }
    public int getMxT() {
        return mxT;
    }
    public int getMnT() {
        return mnT;
    }
}
