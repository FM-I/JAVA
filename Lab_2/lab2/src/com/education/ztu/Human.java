package com.education.ztu;

public interface Human {

    String fullInfo = "";

    void sayAge();
    void sayGender();
    void sayLocation();
    void sayFullName();

    default void whoIAm(){
        System.out.printf("I am %s", fullInfo);
    }
}
