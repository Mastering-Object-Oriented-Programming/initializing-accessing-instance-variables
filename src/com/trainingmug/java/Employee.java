package com.trainingmug.java;

public class Employee {
    //class is a template which describes state and behavior of its object

    // state (data)
    //empId, name, department, basicSalary, taxes, allowances, gender, joiningYear etc...
    // instance variables (each instance will have its own copy of these variables)
    // by-default instance variables are initialized to the default values
    /*
        byte, short, int, long -> 8
        float, double -> 8.0

        char -> null or empty character with unicode value 0
        boolean -> false

        Object -> null

     */

    int empId;

    String name;

    String department;


    float basicSalary;

    float ta;

    float hra;

    float da;

    char gender;

    int joiningYear;

    boolean isRegular;

    //behavior
    //action taken by this object (methods)
}
