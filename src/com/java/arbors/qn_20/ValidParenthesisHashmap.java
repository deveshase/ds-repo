package com.java.arbors.qn_20;

/*Leetcode Problem 20
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Note that an empty string is also considered valid.*/

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesisHashmap {

    boolean isValid = false;
    private HashMap<Character, Character> mappings;

    public ValidParenthesisHashmap() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public static void main(String[] args) {

        ValidParenthesisHashmap validParenthesis = new ValidParenthesisHashmap();


        String inStr = "(]";
        System.out.println("input string:" + inStr + "  -->> isValid:" + validParenthesis.isValidString(inStr));
        /*inStr = "(()";
        (((((()))))) -- VALID
        ()()()()     -- VALID
        (((((((()    -- INVALID
        ((()(())))   -- VALID*/


    }

    public boolean isValidString(String inStr) {

        Stack stack = new Stack();

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);

            if (this.mappings.containsKey(c)) {

                char topElement = stack.empty() ? '#' : (char) stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }

            } else
                stack.push(c);
        }

        return stack.isEmpty();
    }
}
