package com.education.ztu.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> implements Cloneable  {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public Team(Team<T> team){
        this.name = team.name;
        this.participants = team.participants;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        if(participant instanceof Participant) {
            System.out.println("To the team " + name + " was added participant " + ((Participant) participant).getName());
        } else {
            System.out.println("To the team " + name + " was added participant " + participant);
        }
    }
    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("The team " + winnerName + " is winner!");
    }

    public String getName() {
        return name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParticipants(List<T> participants) {
        this.participants = participants;
    }

    @Override
    public Team<T> clone() throws CloneNotSupportedException {
        return new Team<T>(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
