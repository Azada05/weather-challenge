/** Class Day initialized object Day with properties: DayId, Maximum Temperature and Minimu Temperature
 * 
 */

public class Day
{
    // Declare variables
    private int dayId;
    private int mxT;
    private int mnT;

    /**
     * Constructor for Objects Class Day
     */
    public Day(int dayId, int mxT, int mnT) {
        // initialize the variables
        super();
        this.dayId = dayId;
        this.mxT = mxT;
        this.mnT = mnT;
    }
    
    public int getDayId() { 
        return dayId;
    }
    public int getMxT() {
        return mxT;
    }
    public int getMnT() {
        return mnT;
    }
}
