package com.education.ztu;

import java.util.Arrays;

public class Operations {

    public static int addition(int ...nums){
        int sum = 0;

        for(int n: nums)
            sum += n;

        return sum;
    }

    public static int subtraction(int ...nums){

        if(nums.length < 0)
            return 0;

        int sub = nums[0];

        boolean first = true;
        for(int n: nums)
        {
            if(first){
                first = false;
                continue;
            }
            sub -= n;
        }

        return sub;
    }

    public static int multiplication(int ...nums){

        if(nums.length < 0)
            return 0;

        int mul = 1;

        for(int n: nums)
            mul *= n;

        return mul;
    }

    public static double division(int ...nums){

        if(nums.length < 2)
            return 0;

        double div = nums[0];

        boolean first = true;
        for(int n: nums)
        {
            if(first){
                first = false;
                continue;
            }
            if(n == 0)
                continue;

            div /= n;
        }

        return div;
    }

    public static double average(int ...nums){

        if(nums.length == 0)
            return 0;

        double avg = 0;

        for(int n: nums)
            avg += n;

        return avg / nums.length;
    }

    public static int maximum(int ...nums){

        if(nums.length == 0)
            return 0;

        int max = nums[0];

        for(int n: nums)
            if(n > max)
                max = n;

        return max;
    }

    public static int minimum(int ...nums){

        if(nums.length == 0)
            return 0;

        int min = nums[0];

        for(int n: nums)
            if(n < min)
                min = n;


        return min;
    }
}
