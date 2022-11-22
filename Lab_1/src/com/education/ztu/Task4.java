package com.education.ztu;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstArg = -1;
        int secondArg = -1;

        do {
            System.out.print("Введіть перше число більше 0: ");
            firstArg = input.nextInt();
        }while (firstArg <= 0);

        do {
            System.out.print("Введіть друге число більше 0: ");
            secondArg = input.nextInt();
        }while (secondArg <= 0);


        int divider = 1;

        if(firstArg > secondArg){
            divider = secondArg;
        }
        else{
            divider = firstArg;
        }

        while (firstArg % divider != 0 || secondArg % divider != 0){
            --divider;
        }

        System.out.print("Спільний дільник " + divider);
    }
}
