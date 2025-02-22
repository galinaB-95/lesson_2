package org.example;

public class NineClass {
    public static void main(String[] args) {
       int year = 2012;
       boolean c = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)); {
                System.out.println(c);
            }
        }
    }
