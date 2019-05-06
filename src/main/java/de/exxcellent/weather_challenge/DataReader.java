import java.io.FileReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class DataReader 
{
    private static final String DELIMITER = ",";
    private static List<String []> dataList = new ArrayList<String[]>();
    public static void readData(String file)
    {
        BufferedReader br = null;
        try{
            //read csv file
            br = new BufferedReader(new FileReader(file));
            String line="";
            //skip the header
            br.readLine();
            while ((line = br.readLine()) != null){
                  String dataDetails []= line.split(DELIMITER);
                  if (dataDetails.length > 0) {
                        dataList.add(dataDetails);
                    }
                }
        }
        catch (Exception ee)
        {
        ee.printStackTrace();
        }
        finally 
        {
            try
            {
                br.close();
            }
            catch(IOException ie) 
            {
                System.out.println("Error parsing the file");
                ie.printStackTrace();
            }
        }
    }
    public List<String []> getDataArray(){
        return dataList;
    }
}

