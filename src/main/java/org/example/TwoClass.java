package org.example;

public class TwoClass {
    public static void main(String[] args) { checkSumSign ();}
    public static void checkSumSign (){
        int a = 2;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }
}