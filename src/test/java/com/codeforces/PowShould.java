package com.codeforces;

import org.junit.jupiter.api.Test;

class PowShould {
    @Test
    void test() {
        Pow pow = new Pow(2, 3);
        int result = pow.calculate();
        System.out.println(result);
    }
}