import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

/**
 * Created by sidharthas on 25/03/17.
 */
public class HaversineHelper {
    public static Double getDistance(Coordinate src, Coordinate des) {
        return Haversine.distance(src.getLatitude(), src.getLongitude(), des.getLatitude(), des.getLongitude());

    }


}
