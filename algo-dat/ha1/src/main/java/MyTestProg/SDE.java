package MyTestProg;

public class SDE {
    public static []boolean siebDesEratosthenes(int x){
        if (x < 2){
            return null;
        }

        boolean prime[] = new boolean[x+1];
        for(int i=0;i<x;i++){
            prime[i] = true;
        }

        for(int i=2; i*i < x; i++){
            if(prime[i] == true){
                for(int j =(i*i); j<x; j=j+i){
                    prime[j] = false;
                }
            }
        }

        return prime;
    }

}