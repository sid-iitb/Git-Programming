/**
 * Created by sidharthas on 25/03/17.
 */


import com.opencsv.CSVReader;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    static List<Double> time = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.set(1, 3);
        System.out.println(a);
        String orderString[] = {"AM", "R1" , "R2", "C1", "C2"};
        List<Coordinate> navigations= null;
        try {
            FileRead fileRead = new FileRead();
            navigations =fileRead.readRouteData("/Users/sidharthas/Downloads/sid.csv");
            time = fileRead.getTime();
            //navigations = readRouteData("/Users/sidharthas/Downloads/sid.csv");
            PathDecider path = new PathDecider();
            path.paths(navigations, time, true);
            Double distance = path.getDistance();
            int order[] = path.getOrder();
            System.out.println("The total distance is " + distance);
            System.out.println("R1 Distance = "+ HaversineHelper.getDistance(navigations.get(0), navigations.get(1)));
            System.out.println("R2 Distance = "+ HaversineHelper.getDistance(navigations.get(0), navigations.get(2)));
            double dist = 0;
            double cumDist = 0;
            double time = 0;
            for(int i=0;i<order.length;i++){
                if(i==0){
                    dist = 0;
                    cumDist = 0;
                    time = 0;
                }
                else {
                    dist = HaversineHelper.getDistance(navigations.get(order[i]), navigations.get(order[i-1]));
                    cumDist = cumDist + dist;
                    //time =  time + ;
                 }
                Coordinate cod = navigations.get(order[i]);
                System.out.println( orderString[order[i]] + " " +cod.getLatitude()+"   "+ cod.getLongitude() + "  "+ dist + "  "+ cumDist+ " "+ cumDist/20);
            }

            //readRoute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

    }

    /*public static List<Coordinate> readRouteData(String pathToFile) throws Exception {
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
    }*/
}

