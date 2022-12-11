package com.education.ztu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main5 {

    public static void main(String[] args) {

        LocalDateTime dateLab = LocalDateTime.of(2022, 12, 11, 12, 9, 23);
        LocalDateTime date = LocalDateTime.now();

        System.out.println("Day of week : " + dateLab.getDayOfWeek().getValue());
        System.out.println("Day of year : " + dateLab.getDayOfYear());
        System.out.println("Month : " + dateLab.getMonth().getValue());
        System.out.println("Year : " + dateLab.getYear());
        System.out.println("Hour : " + dateLab.getHour());
        System.out.println("Minute : " + dateLab.getMinute());
        System.out.println("Second : " + dateLab.getSecond());

        System.out.println();
        int year = date.getYear();
        IsIntercalary(year);
        IsIntercalary(2023);
        IsIntercalary(2024);
        IsIntercalary(2025);

        if(date.isAfter(dateLab))
            System.out.println("Текущая дата уже после даты начала лабараторной");
        else
            System.out.println("Текущая дата до даты начала лабараторной");

        if(!date.isBefore(dateLab))
            System.out.println("Текущая дата уже после даты начала лабараторной");
        else
            System.out.println("Текущая дата до даты начала лабараторной");


    }

    public static void  IsIntercalary(int year){
        boolean leapyear =  (
                year > 1584 &&
                        (
                                (year % 400 == 0) ||
                                        (year %4 == 0 && year % 100 != 0)
                        )
        );

        if (leapyear)
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");
    }

}
