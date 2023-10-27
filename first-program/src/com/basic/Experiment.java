package com.basic;

import java.util.Arrays;

public class Experiment {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = (int[]) (a);
        a[0] = 4;
        System.out.println(Arrays.toString(b));

    }
}
