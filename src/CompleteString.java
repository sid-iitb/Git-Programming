
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class CompleteString {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            String N = br.readLine();
            if(N.length()>=26)
            {
                HashSet<Character> al=new HashSet<Character>();
                for(int j=0;j<N.length();j++)
                {
                    al.add(N.charAt(j));
                }
                if(al.size()==26)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
