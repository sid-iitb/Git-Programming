/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resursion;

import java.util.Stack;

/**
 *
 * @author sidhsaho
 */
public class Braces {

    public static void main(String[] args) {
        String array[] = {"{}[]()", "{[}]}"};
        Braces(array);
    }

    static String[] Braces(String[] values) {
        String result[] = new String[values.length];
        for (int k = 0; k < values.length; k++) {
            char exp[] = values[k].toCharArray();
            if (check(exp)) {
                result[k] = "YES";
            } else {
                result[k] = "NO";
            }
        }
        return result;

    }

    static boolean check(char exp[]) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < exp.length) {

            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
                s.push(exp[i]);
            }

            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

                if (s.isEmpty()) {
                    return false;
                } else if (!isMatchingPair(s.pop(), exp[i])) {
                    return false;
                }
            }
            i++;
        }

        if (s.isEmpty()) {
            return true; 
        } else {
            return false;  
        }

    }

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')') {
            return true;
        } else if (character1 == '{' && character2 == '}') {
            return true;
        } else if (character1 == '[' && character2 == ']') {
            return true;
        } else {
            return false;
        }
    }

}
