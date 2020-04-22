package com.company;

public class Person {
    private String surname;
    private String name;
    private int age;
    private String gender;

    public Person(String surname, String name, int age, String gender) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
