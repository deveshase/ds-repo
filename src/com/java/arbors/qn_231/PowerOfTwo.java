package com.java.arbors.qn_231;

public class PowerOfTwo {

    boolean isPower = false;

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(20));
    }

    public boolean isPowerOfTwo(int n) {

        long i = 1;

        while (i < n) {
            i *= 2;
        }

        return i == n;
    }
}
