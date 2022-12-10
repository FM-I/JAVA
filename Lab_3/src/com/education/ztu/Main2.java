package com.education.ztu;

import com.education.ztu.game.AgeComparator;
import com.education.ztu.game.NameComparator;
import com.education.ztu.game.Participant;
import com.education.ztu.game.Schoolar;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Mariya", 13);
        Schoolar schoolar2 = new Schoolar("Ivan", 15);
        Schoolar schoolar3 = new Schoolar("Roma", 11);
        Schoolar schoolar4 = new Schoolar("Maxim", 9);

        Collection<Participant> scolary = new ArrayList<Participant>();
        scolary.add(schoolar1);
        scolary.add(schoolar2);
        scolary.add(schoolar3);
        scolary.add(schoolar4);

        AgeComparator ageComparator = new AgeComparator();

        TreeSet<Participant> ageCompare = new TreeSet<Participant>(ageComparator);
        ageCompare.addAll(scolary);

        Comparator<Participant> comparator = new NameComparator().thenComparing(new AgeComparator());
        TreeSet<Participant> nameAgeCompare = new TreeSet<Participant>(comparator);
        nameAgeCompare.addAll(scolary);

        System.out.println("Started list");
        for (Participant p :
                scolary) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("age compare");

        for (Participant p :
                ageCompare) {
            System.out.println(p);
        }
        System.out.println();
        System.out.println("name age compare");

        for (Participant p :
                nameAgeCompare) {
            System.out.println(p);
        }


    }
}
