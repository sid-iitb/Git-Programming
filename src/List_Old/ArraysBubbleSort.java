/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class ArraysBubbleSort {
    public static void main(String args[])
    {
        int a[]={10,3,2,7,3,6,5,4,1,0};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
      /*  int nums[]={10,3,2,7,3,6,5,4,1,0};
        boolean unsorted = true;  
   while (unsorted)  
   {  
      unsorted = false;  
      for (int i = nums.length - 1; i > 0; i--)  
      {  
         if (nums[i] < nums[i-1])  
         {  
            int temp = nums[i];  
            nums[i] = nums[i-1];  
            nums[i-1] = temp;  
            unsorted = true;  
         }  
      }  
   }  */
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
            
    }
}
