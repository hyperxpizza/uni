package MyTestProg;
import java.util.Arrays;
public class SDE {
    public static String siebDesEratosthenes(int n){
        if (n < 2){
            return null;
        }

        int prime[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prime[i] = i;
        }
        for (int first = 2; first * first <= n; first++) {
            if (prime[first] > 0) {
                for (int i = first * 2; i <= n; i += first)
                    prime[i] = 0;
            }
        }
        int numberPrimes = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] > 0) {
                numberPrimes++;
            }
        }

        int j = 0;
        int[] primes = new int[numberPrimes];
        for(int i=2; i<=n; i++){
            if(prime[i] > 0){
                primes[j++] = i;
            }
        }

        return Arrays.toString(primes);
    }

}