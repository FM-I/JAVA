package com.education.ztu.game;

import java.util.Comparator;

public class AgeComparator implements Comparator<Participant> {

    @Override
    public int compare(Participant o1, Participant o2) {
        if(o1.getAge()> o2.getAge())
            return 1;
        else if(o1.getAge() < o2.getAge())
            return -1;
        else
            return 0;
    }
}
