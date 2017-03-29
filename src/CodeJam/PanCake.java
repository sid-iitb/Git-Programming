/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeJam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sidhsaho
 */
public class PanCake {

    static FileWriter f;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader buf = new BufferedReader(new FileReader("B-large.in"));

        f = new FileWriter("output.out");
        int T = Integer.parseInt(buf.readLine());
        //System.out.println(T);

        for (int i = 0; i < T; i++) {
            String input = buf.readLine();
            panCakeRevenge(input, i);
            //sc.nextLine();
        }
        f.close();

    }

    static void panCakeRevenge(String input, int testcase) throws IOException {
        int len = 0;
        int minus = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                len++;
                if (input.charAt(i) == '-') {
                    minus = len;
                }
            }
        }
        f.write("Case #" + (testcase+1) + ": " + minus + "\n");
    }

}
