package com.education.ztu;

public class Main2 {

    public static void main(String[] args) {

        StringBuilder sum = new StringBuilder();
        StringBuilder sub = new StringBuilder();
        StringBuilder mul = new StringBuilder();

        int num1 = 4;
        int num2 = 6;

        sum.append(num1);
        sum.append(" + ");
        sum.append(num2);
        sum.append(" = ");
        sum.append(num1 + num2);

        sub.append(num1);
        sub.append(" - ");
        sub.append(num2);
        sub.append(" = ");
        sub.append(num1 - num2);

        mul.append(num1);
        mul.append(" * ");
        mul.append(num2);
        mul.append(" = ");
        mul.append(num1 * num2);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println();

        int indexSum = sum.indexOf("=");
        int indexSub = sub.indexOf("=");
        int indexMul = mul.indexOf("=");

        sum.deleteCharAt(indexSum);
        sub.deleteCharAt(indexSum);

        sum.insert(indexSum, "рівно");
        sub.insert(indexSub, "рівно");

        mul.replace(indexMul, indexMul + 1, "рівно");

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println();


        sum.reverse();
        sub.reverse();
        mul.reverse();

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println();

        System.out.println("length: " + sum.length() + " capacity: " + sum.capacity());
        System.out.println("length: " + sub.length() + " capacity: " + sub.capacity());
        System.out.println("length: " + mul.length() + " capacity: " + mul.capacity());
        System.out.println();

    }

}
