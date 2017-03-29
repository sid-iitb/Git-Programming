/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class RotateArray {
    public static void main(String[] args) {
        int N=2;
        int M=3;
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]=new int[M][N];
        
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                b[i][j]=a[j][i];
                System.out.println(b[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
}
