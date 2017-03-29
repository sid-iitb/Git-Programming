/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author sidhsaho
 */
public class RodCuttingProblem {
    static int count=0;
    public static void main(String[] args) throws Exception{
      
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String line = br.readLine();
        //int N = Integer.parseInt(line);
        //for (int i = 0; i < N; i++) {
        count=0;
        rod(3);
            System.out.println(count);
        //}

        
    }
    
    static int rod(int num){
        if(num==1){
            //count++;
            return 1;
            
        }
        else{
            if(num/2 == 1)
            
            return count;
            else
            {
                count++;
                return num/2;
            }
        }
        
        //return rod();
        
        
    }
} 
    

