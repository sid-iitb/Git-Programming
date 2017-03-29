/*
 Generate as many distinct primes P such that reverse (P) is also prime and is not equal to P.

Output:
Print per line one integer( ≤ 1015 ). Don't print more than 106 integers in all.

Scoring: 
Let N = correct outputs. 
M= incorrect outputs. Your score will be max(0,N-M).

 */

/**
 *
 * @author sidhsaho
 */
public class ReversePrimes {

    public static void main(String args[]) {
        boolean[] checkForPrime = Primes(10000000);
        int count = 1000000;
        for (int i = 13; i < 10000000 && count >= 0; i = i + 2) {
            if (checkForPrime[i]) {
                if (checkForPrime[reverse(i)]) {
                    {
                        count = count - 1;
                        checkForPrime[reverse(i)] = false;
                        System.out.println(i);
                    }
                }
            }
        }
    }
    
    

    public static boolean[] Primes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        if (n >= 2) {
            isPrime[2] = true;
        }
        for (int i = 3; i <= n; i += 2) {
            isPrime[i] = true;
        }
        for (int i = 3, end = (int) Math.sqrt(n); i <= end; i += 2) {
            if (isPrime[i]) {
                for (int j = i * 3; j <= n; j += i << 1) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static int reverse(int n) {
        String inputString = String.valueOf(n);
        StringBuffer stringBuffer = new StringBuffer(inputString);
        stringBuffer.reverse();
        String reversedString = stringBuffer.toString();
        int reversedInt = Integer.parseInt(reversedString);
        return reversedInt;
    }
}
