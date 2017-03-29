import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
class Main
{
    public static void main (String[] args) throws IOException
    {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(sc.readLine());
        for(int i=0;i<T;i++)
        {
            BigInteger k=new BigInteger(sc.readLine());
            k=k.add(BigInteger.ONE);
            while(true){
                if(check_pallin(k.toString()))
                {
                    System.out.println(k);
                    
                    break;
                }
                k=k.add(BigInteger.ONE);
            }
            //StringBuilder temp=new StringBuilder(k);
            
        }
    }
    static boolean check_pallin(String num)
    {
        StringBuilder num1=new StringBuilder(num);
        String temp = num1.reverse().toString();
        //System.out.println(num+" "+num1+" "+(num1==num));
      return num.equals(temp);
 
    }
    
	
}