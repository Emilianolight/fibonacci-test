package com.test.fibonacci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Map;
/*Fibonacci
* Controller
* API-REST
* */
@RestController
@RequestMapping("/api")
public class FibonacciController {


    @Autowired //Fibonacci Service dependency injection
    FibonacciService fibonacciService;

    @GetMapping("/{index}")  // GET HTTP METHOD
    public Map<String, BigInteger>  getFibonacci(@PathVariable BigInteger index){
        return fibonacciService.getFibonacci(index);

    }
}
