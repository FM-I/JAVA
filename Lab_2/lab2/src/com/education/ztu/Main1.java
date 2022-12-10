package com.education.ztu;


public class Main1 {
    public static void main(String[] args) {

        System.out.println("numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9");

        System.out.println("addition: " + Operations.addition(1,2,3,4,5,6,7,8,9));
        System.out.println("subtraction: " + Operations.subtraction(1,2,3,4,5,6,7,8,9));
        System.out.println("multiplication: " + Operations.multiplication(1,2,3,4,5,6,7,8,9));
        System.out.println("division: " + Operations.division(1,2,3,4,5,6,7,8,9));
        System.out.println("average: " + Operations.average(1,2,3,4,5,6,7,8,9));
        System.out.println("maximum: " + Operations.maximum(1,2,3,4,5,6,7,8,9));
        System.out.println("minimum: " + Operations.minimum(1,2,3,4,5,6,7,8,9));

    }
}