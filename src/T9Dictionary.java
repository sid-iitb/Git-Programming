
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sidhsaho
 */
public class T9Dictionary {

    public static void main(String[] args) {
        int arr[] = {2, 2, 8};
        h.add("bat");
        printWords(arr, 3);
    }
    static HashSet<String> h = new HashSet<>();
    static String keypad[] = {"-", "_", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    static void printWordsUtil(int number[], int curr_digit, char output[], int n) {

        int i;
        if (curr_digit == n) {
            String word = "";
            for (int u = 0; u < n; u++) {
                word = word + output[u];
            }
            if (h.contains(word)) {
                System.out.println(word);
            }
            return;
        }

        for (i = 0; i < (keypad[number[curr_digit]]).length(); i++) {
            output[curr_digit] = keypad[number[curr_digit]].charAt(i);
            printWordsUtil(number, curr_digit + 1, output, n);
            if (number[curr_digit] == 0 || number[curr_digit] == 1) {
                return;
            }
        }
    }

    static void printWords(int number[], int n) {
        char result[] = new char[n];
        printWordsUtil(number, 0, result, n);
    }

}
