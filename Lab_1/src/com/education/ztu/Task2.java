package com.education.ztu;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int firstArg = input.nextInt();
        System.out.print("Введіть друге число: ");
        int secondArg = input.nextInt();
        System.out.print(firstArg + secondArg);
    }
}
