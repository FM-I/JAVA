package com.education.ztu;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;

        do {
            System.out.print("Введіть число більше 0: ");
            num = input.nextInt();
        }while (num <= 0);

        int summ = 0;

        do {
            int digit = num % 10;
            num = num / 10;
            summ += digit;
        }while(num != 0);

        System.out.print(summ);

    }
}
