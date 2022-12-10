package com.education.ztu;

public abstract class Person implements Human{

    private  int age;
    private String firstname;
    private String lastname;
    private Gender gender;
    private Location location;

    public Person(){
        Init("None", "None", 0, Gender.UNKNOWN, Location.UNKNOWN);
    }

    public Person(String firstname, String lastname, int age, Gender gender, Location location){
        Init(firstname, lastname, age, gender, location);
    }

    private void Init(String firstname, String lastname, int age, Gender gender, Location location){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void sayAge() {
        System.out.printf("My age {0}", age);
    }

    public void sayGender() {
        System.out.printf("My gender is {0}", gender);
    }

    public void sayLocation() {
        System.out.printf("My location {0}", location);
    }

    public void sayFullName() {
        System.out.printf("My name {0} {1}", firstname, lastname);
    }

    public String getFullInfo(){
        return fullInfo;
    }
    public abstract void getOccupation();
}

