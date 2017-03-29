/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author sidhsaho
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class XennyClaasrom {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int k = 0; k < N; k++) {
            int n = Integer.parseInt(br.readLine());
            char arr[] = br.readLine().toCharArray();
            boolean flag = true;
            int count = 0;
            for (int i = 0; i <= (n*2) - 2; i++) {
                if (flag) {
                    if (arr[i] > arr[i + 1]) {
                        //swap(arr[i], arr[i+1]);
                        char t = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = t;
                        count++;

                    }
                } else if (arr[i] < arr[i + 1]) {
                    char t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                    count++;

                }

                flag = !flag;
            }
            System.out.println(count);
        }
    }

}


