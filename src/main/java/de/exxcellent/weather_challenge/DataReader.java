import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class DataReader {
    private static final String DELIMITER = ",";
    private static List<String []> dataList = new ArrayList<String[]>(); //define an Arraylist where each line will be stored as an array of strings
    public static List<String[]> readData(String file) {
        BufferedReader br = null;
        try{
            //read csv file
            br = new BufferedReader(new FileReader(file));
            String line = "";
            //skip the header
            br.readLine(); 
            //read from the second line
            while ((line = br.readLine()) != null){
                  String dataDetails []= line.split(DELIMITER);
                  if (dataDetails.length > 0) {
                        dataList.add(dataDetails);
                  }
            }
        }
        //handle exceptions
        catch (Exception ee){
        ee.printStackTrace();
        }
        finally {
            try {
                br.close();
            }
            catch(IOException ie) {
                System.out.println("Error parsing the file");
                ie.printStackTrace();
            }
        }
    return dataList;
    }
}

