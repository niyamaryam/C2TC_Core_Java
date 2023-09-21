package com.tnsif.comparable;

import java.util.Arrays;

public class Executor {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];

        employees[0] = new Employee();
        employees[0].setName("Kabir Singh");
        employees[0].setAge(43);

        employees[1] = new Employee();
        employees[1].setName("Ruhi");
        employees[1].setAge(25);

        employees[2] = new Employee();
        employees[2].setName("Krishna");
        employees[2].setAge(33);

        System.out.println("Order of Employees before sorting:");
        for (int i=0; i<employees.length; i++) {
            System.out.println(employees[i].getName() +" "+ employees[i].getAge());
        }

        System.out.println("\nOrder of employees after sorting by age:");
        Arrays.sort(employees, new AgeComparator());
        for (int i=0; i<employees.length; i++) {
            System.out.println(employees[i].getName() +" "+ employees[i].getAge());
        }
        
        System.out.println("\nOrder of employees after sorting by name:");
        Arrays.sort(employees, new NameComparator());
        for (int i=0; i<employees.length; i++) {
            System.out.println(employees[i].getName() +" "+ employees[i].getAge());
        }
    }

	}

