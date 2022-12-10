package com.education.ztu;


public class Main {
    public static void main(String[] args) {
        Car teacherCar = new Car("bmw");
        Car employeeCar = new Car("reno");

        Person teacherO = new Teacher("mathematician", "ZTK", teacherCar);
        Teacher.showCounter();
        System.out.println();
        Teacher teacherT = new Teacher("physics", "ZTK", teacherCar, "Ivan", "Prochorov", 34, Gender.MALE, Location.ZHYTOMYR);
        Teacher.showCounter();
        System.out.println();

        Person studentO = new Student("Ipz", 3, "ZTK");
        Student.ShowCounter();
        System.out.println();
        Student studentT = new Student("ZIpz", 2, "ZTK", "Vasul", "Kit", 34, Gender.FEMALE, Location.RIVNE);
        Student.ShowCounter();
        System.out.println();

        Person employeeO = new Employee("seller", "ATB", employeeCar);
        Employee.ShowCounter();
        System.out.println();
        Employee employeeT = new Employee("Guardian", "Silpo", employeeCar, "Jeck", "Huardo", 34, Gender.MALE, Location.KIEV);
        Employee.ShowCounter();
        System.out.println();

        System.out.println();
        teacherO.getOccupation();
        System.out.println();
        teacherT.getOccupation();
        System.out.println();

        studentO.getOccupation();
        System.out.println();
        studentT.getOccupation();
        System.out.println();

        employeeO.getOccupation();
        System.out.println();
        employeeT.getOccupation();
        System.out.println();
        System.out.println();

        System.out.println("cast person teacher to teacher " + (teacherO instanceof Teacher));
        System.out.println("cast person teacher to human " + (teacherO instanceof Human));
        System.out.println("cast person student to student " + (studentO instanceof Student));
        System.out.println("cast person employee to employee " + (employeeO instanceof Employee));
        System.out.println("cast person employee to teacher " + (employeeO instanceof Teacher));

    }
}