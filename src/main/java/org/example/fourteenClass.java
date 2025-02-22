package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

public class fourteenClass {
    public static int[] createArray(int len, int intialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = intialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("len:");
        int len = scanner.nextInt();
        System.out.print("intialValue:");
        int initialValue = scanner.nextInt();
        int[] result = createArray(len, initialValue);
        System.out.println("Результат:");
        for (int value : result) {
            System.out.print(value + "");
        }
        scanner.close();
    }
}



