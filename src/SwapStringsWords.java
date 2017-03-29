
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class SwapStringsWords {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            String N[] = br.readLine().split(" ");
            int a=0,b=N.length-1;
            while(a>b)
            {
                String temp=N[a];
                N[a]=N[b];
                N[b]=temp;
            }
            
        }
    }
}
