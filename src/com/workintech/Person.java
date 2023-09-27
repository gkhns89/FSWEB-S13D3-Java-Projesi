package com.workintech;

public class Person {
String firstName;
String lastName;
int age;
String nationality;
boolean isHaveDriverLicense;
long mobileNum;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public Person(String firstName, String lastName, int age, String nationality, boolean isHaveDriverLicense,  long mobileNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.isHaveDriverLicense = isHaveDriverLicense;
        this.mobileNum = mobileNum;
    }
    public Person(){
        this("Gökhan", "Şişman", 34);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isHaveDriverLicense(){
        return isHaveDriverLicense && age>=18;
    }
    public boolean isTeen(){
        return age <= 19 && age >= 13;
    }

    @Override
    public String toString() {

        return String.format("First Name: %s, Last Name: %s, Age: %d", firstName, lastName, age);
    }
}
