package org.example;

import java.util.Arrays;

public class thirteenClass {
    public static void main(String[] args) {
       int size = 5;
        int [] []array= new int [size] [size];
        for (int i = 0; i<size; i++) {
            array[i][i] = 1;
            array[i][size - i - 1] = 1;
        }
        for (int i = 0; i < size; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
