/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author sidhsaho
 */
public class partitionSizeFixed {
    public static void main(String args[])
    {
        int num=6;
        int size=6;
        System.out.println(partition(num,size));
    }
    static int partition(int num,int size)
    {
        if(size==num)
            return 1;
        else if(num==0|| size==0||size>num)
            return 0;
        else
        return partition(num-1, size-1) + partition(num-size, size);
    }
}
