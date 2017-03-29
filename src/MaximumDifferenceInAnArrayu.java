/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class MaximumDifferenceInAnArrayu {
    public static void main(String args[]){
        int arr[]={2,3,10,2,4,8,1};
        int max_diff = arr[1] - arr[0];
  int min_element = arr[0];
  int i;
  for(i = 1; i < arr.length; i++)
  {       
    if (arr[i] - min_element > max_diff)                               
      max_diff = arr[i] - min_element;
    if (arr[i] < min_element)
         min_element = arr[i];                     
  }
        System.out.println(max_diff);
    }
}
