
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hourglasses {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int arr[][] = new int[6][6];
        int arr[][]={
        
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0},
        };
        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }*/
        int sum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int suma=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(suma>sum){
                 sum=suma;   
                }
            }
        }
        System.out.println(sum);
    }

     
}
