package com.education.ztu;

public class Employee extends Person {

    private static int counter = 0;
    private Car car;
    private String company;
    private String position;

    public Employee(String company, String position, Car car){
        super();
        Init(company, position, car);
    }

    public Employee(String company, String position, Car car, String firstname, String lastname, int age, Gender gender, Location location){
        super(firstname, lastname, age, gender, location);
        Init(company, position, car);
    }

    private void Init(String company, String position, Car car){
        this.company = company;
        this.position = position;
        this.car = car;
        ++counter;
    }

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        this.car = car;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getPosition(){
        return  position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void getOccupation() {
        System.out.printf("Employee occupation %s %s", position, company);
    }

    public static int ShowCounter(){
        System.out.printf("Counter employee %d", counter);
        return counter;
    }

}
