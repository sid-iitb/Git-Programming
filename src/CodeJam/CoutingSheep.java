/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author sidhsaho
 */
public class CoutingSheep {
    static FileWriter f;
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("A-large.in"));
        
        f=new FileWriter("output.out");
        int T = sc.nextInt();
        //System.out.println(T);
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(N);
            counting(N, i);
            sc.nextLine();
        }
        f.close();
        
        
    }

    static void counting(int N, int test) throws IOException {
        HashSet<Character> store = new HashSet<>();
        int m = 1;
        while (true) {
            String number = String.valueOf(m * N);
            char[] digits1 = number.toCharArray();
            //int len=store.size();
            for (int i = 0; i < digits1.length; i++) {
                store.add(digits1[i]);
            }
            
            if (store.size() == 10) {
                f.write("Case #"+(test+1)+": "+m * N+"\n");
                return;
            }
            
            m++;
            if(N==m*N){
                f.write("Case #"+(test+1)+": INSOMNIA\n");
                return;
            }
        }
    }

    

}
