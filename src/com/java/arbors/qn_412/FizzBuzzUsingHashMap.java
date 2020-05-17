package com.java.arbors.qn_412;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FizzBuzzUsingHashMap {

    private List<String> lst;

    public static void main(String[] args) {
        FizzBuzzUsingHashMap fb = new FizzBuzzUsingHashMap();
        List listRes = fb.fizzBuzz(17);

        System.out.println("Res:");

    }


    public List<String> fizzBuzz(int n) {

        List<String> lst = new ArrayList<String>();

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");


        for (int i=1; i<=n; i++){
            String res = "";

            for (Integer key: map.keySet()){
                if(i % key == 0)
                    res += map.get(key);
            }

            if(res == "")
                res += Integer.toString(i);


            lst.add(res);
        }

        return lst;
    }
}
