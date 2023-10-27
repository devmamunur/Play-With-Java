package com.array;


import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 24;
//        arr[2] = 25;
//        arr[3] = 26;
//        arr[4] = 27;

        for (int i =0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

//        for (int num : arr){
//            System.out.print(num + " ");
//        }

        System.out.print(Arrays.toString(arr));

    }
}
