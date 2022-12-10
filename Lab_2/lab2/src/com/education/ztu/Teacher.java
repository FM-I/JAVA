package com.education.ztu;

public class Teacher extends Person{

    private static int counter = 0;
    private Car car;
    private String subject;
    private String university;

    public Teacher(String subject, String university, Car car) {
        super();
        Init(subject, university, car);
    }

    public Teacher(String subject, String university, Car car, String firstname, String lastname, int age, Gender gender, Location location) {
        super(firstname, lastname, age, gender, location);
        Init(subject, university, car);
    }

    private void Init(String subject, String university, Car car){
        this.car = car;
        this.subject = subject;
        this.university = university;
        ++counter;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void getOccupation() {
        System.out.printf("Teacher occupation %s in %s", subject, university);
    }

    public static int showCounter(){
        System.out.printf("Counter teacher %d", counter);
        return counter;
    }
}
