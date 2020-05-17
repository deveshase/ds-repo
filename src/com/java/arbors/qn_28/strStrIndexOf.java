package com.java.arbors.qn_28;

public class strStrIndexOf {

    public static void main(String[] args) {
        strStrIndexOf st = new strStrIndexOf();
        System.out.println(st.strStr("abftced","ce"));
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
