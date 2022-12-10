package com.education.ztu.game;

public class Game {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);

        Student student1 = new Student("Mykola", 20);
        Student student2 = new Student("Viktoria", 21);
        Student student3 = new Student("Ivan", 23);
        Student student4 = new Student("Olga", 21);

        Employee employee1 = new Employee("Andriy", 28);
        Employee employee2 = new Employee("Oksana", 25);
        Employee employee3 = new Employee("Viktoria", 28);
        Employee employee4 = new Employee("Sergey", 25);

        Team<Schoolar> scollarTeam = new Team<Schoolar>("Dragon");
        scollarTeam.addNewParticipant(schoolar1);
        scollarTeam.addNewParticipant(schoolar2);

        Team<Schoolar> scollarTeam2 = new Team<Schoolar>("Rozumnyky");
        scollarTeam2.addNewParticipant(schoolar3);
        scollarTeam2.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<Student>("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Student> studentTeam2 = new Team<Student>("Nazad");
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        Team<Employee> employeeTeam = new Team<Employee>("Robotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Employee> employeeTeam2 = new Team<Employee>("Bezrobitni");
        employeeTeam2.addNewParticipant(employee3);
        employeeTeam2.addNewParticipant(employee4);

        scollarTeam.playWith(scollarTeam2);
        studentTeam.playWith(studentTeam2);
        employeeTeam.playWith(employeeTeam2);
    }
}
