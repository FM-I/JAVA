package com.education.ztu;

public class Task7 {
    public static void main(String[] args) {

        char[] letters = new char[]{
                'A', 'E', 'I', 'O', 'U', 'Y', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
        };

        for (char letter :
                letters) {
            System.out.println(letter + " ==> " + (int)letter);
        }
    }
}
