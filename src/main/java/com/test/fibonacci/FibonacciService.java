package com.test.fibonacci;


import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Map;
/*
FibonacciService
 */
@Service
public class FibonacciService {

    //Method that performs the Fibonacci procedure and returns the result.
    public Map<String, BigInteger> getFibonacci(BigInteger index){

        if (index.compareTo(BigInteger.ZERO) <= 0) {
            return Map.of("Fibonacci", BigInteger.ZERO);
        } else if (index.equals(BigInteger.ONE)) {
            return Map.of("Fibonacci", BigInteger.ONE);
        } else {
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            BigInteger result = BigInteger.ZERO;

            for (BigInteger  i = BigInteger.TWO; i.compareTo(index) <= 0 ; i = i.add(BigInteger.ONE)) {
                result = a.add(b);
                a = b;
                b = result;
            }

            return Map.of("Fibonacci", result);
        }

    }
}
