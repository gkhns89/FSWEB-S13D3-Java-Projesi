package com.workintech;

public class Main {
    public static void main(String[] args) {

        String dLicense;


        System.out.println("Hello world!");

        new Person();

        Person x = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + x.getFirstName());

        System.out.println("LastName: " + x.getLastName());

        System.out.println("Age: " + x.getAge());

        System.out.println("Is Teen: " + x.isTeen());

        Person y = new Person("Reinier", "Zonneveld", 32,"NL",true,243611111);

        if (y.isHaveDriverLicense()) dLicense = "Exists"; else dLicense ="Not Exists";

        System.out.println("Firstname: " + y.getFirstName());

        System.out.println("LastName: " + y.getLastName());

        System.out.println("Age: " + y.getAge());

        System.out.println("Driver License: " + dLicense);

        System.out.println("Is Teen: " + y.isTeen());
    }
}