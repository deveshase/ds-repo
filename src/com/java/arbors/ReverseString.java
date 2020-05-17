package com.java.arbors;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'R','a','b','B','i','t'};

        System.out.println("Original String:" + s.toString());
        //System.out.println("Reversed String:" + reverseString(inputString));
    }

    public static String reverseString(char[] s) {

        char[] reversed = { };

        Stack stack = new Stack();

        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
            System.out.println("Pushed element " + s[i] + " to stack");
        }

        while (!stack.isEmpty()) {
            //reversed =  stack.pop();
        }

        return "";

    }
}
