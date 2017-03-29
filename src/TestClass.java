
import java.util.Scanner;

class TestClass{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
//Write your code here
class MyOwnException extends Exception {
   public MyOwnException(String msg){
      super(msg);
   }
}
class Calculator{
    int power(int n,int p) throws MyOwnException{
        if(n<0 || p<0)
        {
            throw new MyOwnException("n and p should be non-negative");
        }
        else{
            return (int) Math.pow(n, p);
        }
        
    }
}