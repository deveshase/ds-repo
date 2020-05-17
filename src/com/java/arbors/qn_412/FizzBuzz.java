package com.java.arbors.qn_412;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<String> lst;

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(10);

    }


    public List<String> fizzBuzz(int n) {

        lst = new ArrayList<String>();

        for (int i=1; i<=n; i++){

            if(i % 3 ==0)
                lst.add("Fizz");
            else if (i % 5 == 0)
                lst.add("Buzz");
            else if (i%3 == 0 && i%5 == 0)
                lst.add("FizzBuzz");
            else
                lst.add(Integer.toString(i));
        }

        return lst;
    }
}
