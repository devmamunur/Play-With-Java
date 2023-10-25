package com.mamun;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 234567;
        int o = 0;
 
        while (n > 0){
            int rem = n % 10;
            o = o * 10 +rem;
            n = n / 10;
        }

        System.out.println(o);
    }
}
