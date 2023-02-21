package com.codeWars.six.Prime;

public class Prime {
    public boolean isPrime(int num) {
        if(num < 2) return false;
        if(num == 2 || num == 3) return true;
        if(num%2 == 0 || num%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(num)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(num%(i-1) == 0 || num%(i+1) == 0) return false;
        }
        return true;
    }

}
