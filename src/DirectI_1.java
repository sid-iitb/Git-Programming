package DS_Old;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SIDHARTHA
 */
public class DirectI_1 {

    public static void main(String args[]) {
        int a[][] = {{1, 1}, {1, 34}, {1, 3}, {1, 98}, {1, 9}, {1, 76}, {1, 45}, {1, 4}};
        String b[] = {"1", "34", "3", "98", "9", "76", "45", "4"};
        Comparator<Integer[]> d = new c();
        Queue q=new LinkedList();
       
        //Arrays.sort(a,d);
        //Arrays.sort(a,d);
        Arrays.sort(a,
                new java.util.Comparator<int[]>() {
                    @Override
                    public int compare(int[] t, int[] t1) {
                        int c = Integer.parseInt(t[1] + "" + t1[1]);
                        int d = Integer.parseInt(t1[1] + "" + t[1]);
                        System.out.println(c + " " + d);
                        if (c > d) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }

                });
        Arrays.sort(b,
                new Comparator<String>() {

                    @Override
                    public int compare(String t, String t1) {
                        int c = Integer.parseInt(t + "" + t1);
                        int d = Integer.parseInt(t1 + "" + t);
                        System.out.println(c + " " + d);
                        if (c > d) {
                            return -1;
                        } else {
                            return 1;
                        }

                    }

                });
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i]);
        }
    }

    static class c implements java.util.Comparator<Integer[]> {

        @Override
        public int compare(Integer t[], Integer t1[]) {
            int a = Integer.parseInt(t[1] + "" + t1[1]);
            int b = Integer.parseInt(t1[1] + "" + t[1]);
            if (a > b) {
                return 1;
            } else {
                return -1;
            }
        }

    }
}
