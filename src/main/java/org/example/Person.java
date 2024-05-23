package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    double angerCoefficent;
    double height;
    int weight;

    public Person(String firstname, String lastName, int age){
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person (String firstname, String lastName, int age, double angerCoefficent, double height, int weight){
        this(firstname, lastName, age);
        this.angerCoefficent=angerCoefficent;
        this.height=height;
        this.weight=weight;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }

}
