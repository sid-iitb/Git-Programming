import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sidharthas on 25/03/17.
 */
public class PathDecider {
    public static int a[][] = {{0, 1, 3, 2, 4},
            {0, 1, 2, 3, 4},
            {0, 1, 2, 4, 3},
            {0, 2, 4, 1, 3},
            {0, 2, 1, 3, 4},
            {0, 2, 1, 4, 3}
    };
    public static List<Integer> ignoreIndex = new ArrayList();
    public static double distance = Double.MAX_VALUE;
    public  static int order = 0;

    public static void paths(List<Coordinate> coordinates, List<Double> time, boolean createIgnore){
        if(createIgnore){
            createIgnoreIndex(coordinates, time);
        }

        for (int i = 0; i < a.length && !ignoreIndex.contains(i); i++) {
            Double interim = HaversineHelper.getDistance(coordinates.get(a[i][0]), coordinates.get(a[i][1])) +
                    HaversineHelper.getDistance(coordinates.get(a[i][1]), coordinates.get(a[i][2])) +
                    HaversineHelper.getDistance(coordinates.get(a[i][2]), coordinates.get(a[i][3])) +
                    HaversineHelper.getDistance(coordinates.get(a[i][3]), coordinates.get(a[i][4]));
            if(distance > interim){
                distance = interim;
                order = i;
            }

        }


    }

    public static void createIgnoreIndex(List<Coordinate> coordinates, List<Double> time){
        Double R1Time = (HaversineHelper.getDistance(coordinates.get(0), coordinates.get(1)))/20;
        Double R2Time = (HaversineHelper.getDistance(coordinates.get(0), coordinates.get(2)))/20;
        Double R1PrepTime = (time.get(0))/60;
        Double R2PrepTime = (time.get(1))/60;

        System.out.println("Creating ignore List");
        System.out.println("R1 PrepTime = " + R1PrepTime + " R1Time = " + R1Time);
        System.out.println("R2 PrepTime = " + R2PrepTime + " R2Time = " + R2Time);
        boolean ignoreR1 = false;
        boolean ignoreR2 = false;
        boolean noIgnore = true;
        if(R2PrepTime > R2Time && R1PrepTime < R1Time){
            noIgnore = false;
            ignoreR2 = true;

        }

        else if(R1PrepTime > R1Time && R2PrepTime < R2Time){
            noIgnore = false;
            ignoreR1 = true;
        }



        if(!noIgnore && ignoreR1){
            ignoreIndex.add(new Integer(0));
            ignoreIndex.add(new Integer(1));
            ignoreIndex.add(new Integer(2));
        }
        else if(!noIgnore && ignoreR2){
            ignoreIndex.add(new Integer(3));
            ignoreIndex.add(new Integer(4));
            ignoreIndex.add(new Integer(5));
        }

    }

    public static double getDistance(){
        return distance;
    }
    public static int[] getOrder(){
        return a[order];
    }
    //public stat
}
