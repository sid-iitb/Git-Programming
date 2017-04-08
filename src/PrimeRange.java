package DS_Old;

import java.io.*;
public class PrimeRange {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(buf.readLine());
        int t[]=new int[10];
        //for(int y=0;y<10;y++)
          //  t[y]=y;
        for(int s=0;s<T;s++)
        {
            for(int se=0;se<=9;se++)
                t[se]=0;
            String n[]=buf.readLine().split(" ");
            int L=Integer.parseInt(n[0]);
            int R=Integer.parseInt(n[1]);
            int count=0;
                    boolean[] checkForPrime = Primes(100000000);

            for(int i=L;i<=R;i++)
            {
                if(checkForPrime[i])
                {
                    //System.out.println(i+" ");
                    //int count=0;
                    count=count+1;
                    int num=i;
                    while(num!=0)
                    {
                        int re=num%10;
                        t[re]=t[re]+1;
                        num=num/10;
                    }
                }
            }
            if(count==0)
            {
                System.out.println("-1");
                continue;
            }
            int max=t[0];int index=0;
            for(int i=1;i<10;i++)
            {
                if(max==t[i] && index<i)
                {
                    max=t[i];
                    index=i;
                }
                else if(max<t[i] )
                {
                    max=t[i];
                    index=i;
                }
            }
            System.out.println(index);
        }
    }
    public static boolean[] Primes(int n)
    {
        boolean[] isPrime = new boolean[n + 1];
        if (n >= 2)
            isPrime[2] = true;
        for (int i = 3; i <= n; i += 2)
            isPrime[i] = true;
        for (int i = 3, end = sqrt(n); i <= end; i += 2)
        {
            if (isPrime[i]) 
            {
                for (int j = i * 3; j <= n; j += i << 1)
                    isPrime[j] = false;
            }
        }
        return isPrime;
    }
 public static int sqrt(int x)
    {
        int y = 0;
        for (int i = 15; i >= 0; i--) 
        {
            y |= 1 << i;
            if (y > 46340 || y * y > x)
                y ^= 1 << i;
        }
        return y;
        }
}
