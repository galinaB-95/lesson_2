package org.example;

import java.util.Arrays;

import static java.util.stream.IntStream.range;

public class ElevenClass {
    public static void main(String[] args) {
    int[] array = new int [100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;  }
        System.out.println(Arrays.toString(array));

    }}

