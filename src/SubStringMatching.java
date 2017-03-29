
import java.io.BufferedReader;
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
public class SubStringMatching {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String input = br.readLine();
        //String line = br.readLine();
        //int N = Integer.parseInt(line);
        //for (int i = 0; i < N; i++) {
        ///    int Q = Integer.parseInt(br.readLine());
        System.out.println(SubString("zaaxbaacbaa", 5));
        //}

    }

    static int SubString(String input, int num) {
        String word1 = input.substring(0, num);
        String word2 = input.substring(input.length() - num, input.length());
        System.out.println(word1 + " " + word2);
        int m = word1.length();
        int n = word2.length();
        int LCSuff[][] = new int[m + 1][n + 1];
        int result = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    LCSuff[i][j] = 0;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1;
                    result = Math.max(result, LCSuff[i][j]);
                } else {
                    LCSuff[i][j] = 0;
                }
            }
        }

        return result;
    }

}
