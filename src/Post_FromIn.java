
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class Post_FromIn {
    public static void main(String args[])
    {
        
        int in[]={4,2,5,1,6,3};
        int pre[]={1,2,4,5,3,6};
        postorder(in, pre);
    }
    static void postorder(int in[],int pre[],int len)
    {
        int root=search(in, pre[0]);
        if(root!=0)
        {
            //int pre1[]=Arrays.copyOfRange(pre, 1, pre.length-1);
            
            postorder(in, Arrays.copyOfRange(pre, 1,in.length), root);
        }
        if(root!=len-1)
        {
           // int in1[]=Arrays.copyOfRange(in, root+1, in.length-1);
           // int pre1[]=Arrays.copyOfRange(pre,);
           // System.out.print((root+1) +" "+in.length);
            //if ((root+1)<=(in.length-1))
            postorder(Arrays.copyOfRange(in,root+1,in.length),Arrays.copyOfRange(pre,root+1,pre.length), len-root-1);
        }
        System.out.println(pre[0]+" ");
    }
    static void postorder(int in[],int pre[])
    {
        int root=search(in, pre[0]);
        if(root!=0)
        {
            postorder(Arrays.copyOfRange(in, 0,root),Arrays.copyOfRange(pre, 1,root+1));
        }
        if(root!=in.length-1)
        {
           // int in1[]=Arrays.copyOfRange(in, root+1, in.length-1);
           // int pre1[]=Arrays.copyOfRange(pre,);
           // System.out.print((root+1) +" "+in.length);
            //if ((root+1)<=(in.length-1))
            postorder(Arrays.copyOfRange(in,root+1,in.length),Arrays.copyOfRange(pre,root+1,pre.length));
        }
        System.out.println(pre[0]+" ");
    }
    static int search(int in[],int x)
    {
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
}
