import java.io.*;
public class Solution_1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String a[]=buf.readLine().split(" ");
        String b[]=buf.readLine().split(" ");
        int alen=a.length;
        int blen=b.length;
        //System.out.println("ASd.".toLowerCase());
        for(int i=0;i<alen;i++)
            a[i]=a[i].toLowerCase();
        for(int i=0;i<blen;i++)
            b[i]=b[i].toLowerCase();
        int c=0;
        for(int i=0;i<blen;i++)
        {
            for(int j=0;j<alen;j++)
            {
                if(b[i].compareTo(a[j])==0 || a[j].startsWith(b[i]) || b[i].startsWith(a[j]))
                {
                    c++;
                    break;
                }
            }
        }
        System.out.println((100*c)/blen);
    }
}