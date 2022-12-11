package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        SomeoneMethod("I learn Java!!!");
    }

    public static void SomeoneMethod(String str){

        char lastLetter = str.charAt(str.length() - 1);
        boolean end = str.endsWith("!!!");
        boolean start = str.startsWith("I learn");
        boolean contain = str.contains("Java");
        int posJava = str.indexOf("Java");
        String change = str.replace('a', 'o');
        String upReg = str.toUpperCase();
        String lowReg = str.toLowerCase();
        String sub = str.substring(posJava, posJava + "java".length());

        System.out.println("Last letter: " + lastLetter);
        System.out.println("str end with '!!!': " + end);
        System.out.println("str start with 'I learn' : " + start);
        System.out.println("str contain 'Java': " + contain);
        System.out.println("index 'Java': " + posJava);
        System.out.println("a change o: " + change);
        System.out.println("up reg: " + upReg);
        System.out.println("low reg: " + lowReg);
        System.out.println("substring 'Java': " + sub);
    }

}