package com.education.ztu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {
    static int[] fibonacci(int number) {
        int [] fibonacci = new int[number];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        int index = 0;
        int summ = 0;

        for (int i = 2; i < number; ++i){

            summ = fibonacci[index] + fibonacci[index + 1];
            fibonacci[i] = summ;
            index++;
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;

        do {
            System.out.print("Введіть число більше 2: ");
            num = input.nextInt();
        }while (num <= 1);

        int[] fibonacci = fibonacci(num);

        for (int item :
                fibonacci) {
            System.out.print(item + " ");
        }

        int [] reverseFibonacci = new int[fibonacci.length];

        for (int i = fibonacci.length - 1 , j = 0; i >= 0; --i, j++){
            reverseFibonacci[j] = fibonacci[i];
        }

        System.out.println();

        for (int item :
                reverseFibonacci) {
            System.out.print(item + " ");
        }
    }
}
