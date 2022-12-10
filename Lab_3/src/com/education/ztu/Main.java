package com.education.ztu;

import com.education.ztu.game.*;

public class Main {

    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Student student1 = new Student("Mykola", 20);
        Employee employee1 = new Employee("Andriy", 28);

        Team<Schoolar> scollarTeam = new Team<Schoolar>("Dragon");
        scollarTeam.addNewParticipant(schoolar1);

        Team<Student> studentTeam = new Team<Student>("Vpered");
        studentTeam.addNewParticipant(student1);

        Team<Employee> employeeTeam = new Team<Employee>("Robotyagi");
        employeeTeam.addNewParticipant(employee1);

        try {
            Schoolar schoolar2 = (Schoolar)schoolar1.clone();
            Student student2 = (Student)student1.clone();
            Employee employee2 = (Employee)employee1.clone();
            System.out.println();

            System.out.println("scholar1");
            System.out.println(schoolar1.toString());
            System.out.println(schoolar1.hashCode());
            System.out.println();

            System.out.println("scholar2 clone scholar1");
            System.out.println(schoolar2.toString());
            System.out.println(schoolar2.hashCode());
            System.out.println();

            System.out.println("student1");
            System.out.println(student1.toString());
            System.out.println(student1.hashCode());
            System.out.println();

            System.out.println("student2 clone student1");
            System.out.println(student2.toString());
            System.out.println(student2.hashCode());
            System.out.println();

            System.out.println("employee1");
            System.out.println(employee1.toString());
            System.out.println(employee1.hashCode());
            System.out.println();

            System.out.println("employee2 clone employee1");
            System.out.println(employee2.toString());
            System.out.println(employee2.hashCode());
            System.out.println();

            Team cloneTeam = scollarTeam.clone();
            System.out.println("scollarTeam");
            System.out.println(scollarTeam.toString());
            System.out.println(scollarTeam.hashCode());
            System.out.println();

            System.out.println("cloneTeam clone scollarTeam");
            System.out.println(cloneTeam.toString());
            System.out.println(cloneTeam.hashCode());

        }catch (CloneNotSupportedException ex){
            System.out.println("Clonable not implemented");
        }

    }
}
