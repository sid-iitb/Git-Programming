
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sidhartha
 */
public class CODEFORCEMAGNET {
    
    public static void main(String args[]) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
        //String s = "";
        //int k = 1;
        int count=1;
        String a[]=new String[n];
        for(int i=0;i<n;i++)
            a[i]=buf.readLine();
        String temp=a[0];
        for (int i = 1; i < n; i++) {
            
            if (!temp.equals(a[i])) {
                count++;
                temp=a[i];
          //      k = k + 3;
            } 
           // s=s+ith;
        }
        //System.out.println(s);
        
        System.out.println(count);
    }
}
    

