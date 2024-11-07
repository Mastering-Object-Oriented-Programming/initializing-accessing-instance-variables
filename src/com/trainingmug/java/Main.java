package com.trainingmug.java;

public class Main {
    public static void main(String[] args) {
        // Creating Employee Objects
        // instances (synonym for object)
        // Two Types of data
        // Primitives (byte, short, int, long, float, double, char, boolean)
        // Object

        // byte age= 100;

        new Employee(); //create a new Employee object
        new Employee(); //create another new Employee object

        Employee emp; // emp is a reference variable only, no object will be created here
        byte age;
        age = 100;

        emp = new Employee(); // A new Employee object will be created and will be referred by emp

        Employee emp1; // reference variable
        emp1 = new Employee();

        // Stack , Heap
        // All objects will be stored in heap memory

        // All local variables are stored in stack

        System.out.println("--------- Default Values ---------");
        //Access instance variables
        System.out.println("Employee Id : " + emp.empId);
        System.out.println("Employee Name : " + emp.name);
        System.out.println("Employee Department : " + emp.department);
        System.out.println("Employee Basic Salary : " +emp.basicSalary);
        System.out.println("Employee Travelling Allowances :" + emp.ta);
        System.out.println("Employee HRA : " + emp.hra);
        System.out.println("Employee Direct Allowances : " + emp.da);
        System.out.println("Employee Gender : " + emp.gender);
        System.out.println("Employee Joining Year : " + emp.joiningYear);
        System.out.println("Is Regular Employee ?" + emp.isRegular);

        // initialize Employee objects data

        emp1.empId = 22222;
        emp1.name = "emp2";
        emp1.department = "production";
        emp1.basicSalary = 445345.34f;
        emp1.ta = 443.34f;
        emp1.da = 665.34f;
        emp1.hra = 2234.56f;
        emp1.gender = 'F';
        emp1.joiningYear = 2019;
        emp1.isRegular = false;

        //

        System.out.println("--------------- Employee 2 -------------------");

        System.out.println("Employee Id : " + emp1.empId);
        System.out.println("Employee Name : " + emp1.name);
        System.out.println("Employee Department : " + emp1.department);
        System.out.println("Employee Basic Salary : " + emp1.basicSalary);
        System.out.println("Employee Travelling Allowances : " + emp1.ta);
        System.out.println("Employee Travelling Allowances :" + emp1.ta);
        System.out.println("Employee HRA : " + emp1.hra);
        System.out.println("Employee Direct Allowances : " + emp1.da);
        System.out.println("Employee Gender : " + emp1.gender);
        System.out.println("Employee Joining Year : " + emp1.joiningYear);
        System.out.println("Is Regular Employee ?" + emp1.isRegular);

        Employee emp3;
        emp3 = new Employee();
        System.out.println("Employee 3 Name : " + emp3.name);

        System.out.println(new Employee().name);
    }
}
