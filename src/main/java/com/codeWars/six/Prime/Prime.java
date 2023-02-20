package com.codeWars.six.Prime;

public class Prime {
    public boolean isPrime(int num) {
        int count = 0;
        if (num < 0 || num == 0 || num ==1)
            return false;
        for (int index = 1; index <= num; index++) {
            if (num % index == 0)
                count++;

            if (count > 2)
                return false;
        }
        return true;
    }

}
