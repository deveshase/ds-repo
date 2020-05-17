package com.java.arbors;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        String inputString = "This is a test string";
        System.out.println("Original String:" + inputString);
        System.out.println("Reversed String:" + reverseString(inputString));
    }

    public static String reverseString(String inputString) {

        String reversedString = "";

        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
            System.out.println("Pushed element " + inputString.charAt(i) + " to stack");
        }

        while (!stack.isEmpty()) {
            reversedString = reversedString + stack.pop();
        }

        return reversedString;

    }
}
