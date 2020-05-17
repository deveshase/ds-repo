package com.java.arbors.qn_20;

/*Leetcode Problem 20
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Note that an empty string is also considered valid.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ValidParenthesis {

    boolean isValid = false;

    public static void main(String[] args) {

        ValidParenthesis validParenthesis = new ValidParenthesis();


        String inStr = "(]";
        System.out.println("input string:" + inStr + "  -->> isValid:" + validParenthesis.isValidString(inStr));
        /*inStr = "(()";
        (((((()))))) -- VALID
        ()()()()     -- VALID
        (((((((()    -- INVALID
        ((()(())))   -- VALID*/

    }


    public boolean isValidString(String inStr) {

        //Stack stack = new Stack();
        /*List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < inStr.length(); i++) {
            list.add(inStr.charAt(i));

        }*/




        return false;
    }
}
