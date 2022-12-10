package com.education.ztu;

public class Student extends Person{

    private static int counter = 0;

    private int course;
    private String speciality;
    private String university;

    public Student(String speciality, int course, String university) {
        super();
        Init(speciality, university, course);
    }

    public Student(String speciality, int course, String university, String firstname, String lastname, int age, Gender gender, Location location) {
        super(firstname, lastname, age, gender, location);
        Init(speciality, university, course);
    }

    private void Init(String speciality, String university, int course){
        this.speciality = speciality;
        this.course = course;
        this.university = university;
        ++counter;
    }

    public int getCourse(){
        return course;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public String getSpeciality(){
        return speciality;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public String getUniversity(){
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void getOccupation() {
        System.out.printf("Student occupation %s in %s", speciality, university);
    }

    public static int ShowCounter(){
        System.out.printf("Counter student %d", counter);
        return counter;
    }

}
