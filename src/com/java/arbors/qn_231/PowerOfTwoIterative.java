package com.java.arbors.qn_231;

public class PowerOfTwoIterative {

    public static void main(String[] args) {
        PowerOfTwoIterative powerOfTwo = new PowerOfTwoIterative();
        System.out.println(powerOfTwo.isPowerOfTwo(8));
    }

    public boolean isPowerOfTwo(int n) {

        if (n <= 0){
            return false;
        }

        while(n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}
