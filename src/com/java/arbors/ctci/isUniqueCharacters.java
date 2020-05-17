package com.java.arbors.ctci;

public class isUniqueCharacters {

    boolean isUniqueCharactersInString(String str){

        boolean isUnique = false;

        if(str.length()>128) return false;

        boolean[] charset = new boolean[128];
        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i);
            if (charset[val])
                return false;

            charset[val] = true;
        }


        return true;
    }
}
