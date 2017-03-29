/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class StringSimilarity {

    public static void main(String args[]) {
        StringSimilarity("ababaa");
    }

    static void StringSimilarity(String word) {
        int c = 0, j;
    char[] array = word.toCharArray();
    int n = array.length;
    for (int i = 0; i < n; i++) {
        for (j = 0; j < n - i && i + j < n; j++)
        if (array[i + j] != array[j])
            break;
        c=c+j;
    }
        System.out.println(c);
    }
    
}
