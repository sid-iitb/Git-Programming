import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sidharthas on 25/03/17.
 */
public class FileRead {
    static List<Double> time = new ArrayList<>();

    public static List<Double> getTime() {
        return time;
    }

    public static List<Coordinate> readRouteData(String pathToFile) throws Exception {
        List<Coordinate> coordinates=new ArrayList<Coordinate>();
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(pathToFile));
        } catch (FileNotFoundException e) {
            throw new Exception("File not found");
        }
        String [] nextLine;
        int index = 0;
        try {
            while ((nextLine = reader.readNext()) != null) {
                if(null==nextLine || nextLine.length!=2){
                    continue;
                    //throw new Exception("Unexpected input in file");
                }
                try {
                    if (index>=5){
                        time.add(Double.valueOf(nextLine[1]));
                        System.out.println(nextLine[1]);
                    }
                    else {
                        Double latitude= Double.valueOf(nextLine[0]);
                        Double longitude= Double.valueOf(nextLine[1]);
                        Coordinate code = new Coordinate();
                        System.out.println(latitude + " "+longitude);
                        code.setLatitude(latitude);
                        code.setLongitude(longitude);
                        coordinates.add(code);
                        index++;}
                }catch (NumberFormatException e){
                    continue;
                    //throw new Exception("Unexpected input in file");
                }
            }
        } catch (IOException e) {
            throw new Exception("Failed to read from file");
        }
        return coordinates;
    }
}
