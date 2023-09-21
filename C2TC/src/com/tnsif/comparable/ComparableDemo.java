package com.tnsif.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp> {
    private static int empIdCounter = 1;
    
    private int empId;
    private String ename;
    private double sal; // Sorting parameter

    public Emp() {
        this.empId = empIdCounter++;
    }

    public Emp(int empId, String ename, double sal) {
        this.empId = empId;
        this.ename = ename;
        this.sal = sal;
    }

    // Implementing compareTo to sort by salary
    @Override
    public int compareTo(Emp o) {
        if (this.sal == o.sal) {
            return 0;
        } else if (this.sal > o.sal) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Emp(EmpId=" + empId + ", Ename=" + ename + ", Sal=" + sal + ")";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<Emp>();
        emps.add(new Emp(1, "Harry", 2504000.0));
        emps.add(new Emp(2, "Marry", 18000.0));
        emps.add(new Emp(3, "Karry", 12000.0));
        emps.add(new Emp(4, "Tarry", 14000.0));

        // BEFORE SORTING
        System.out.println(emps);
        Collections.sort(emps);
        // After SORTING
        System.out.println(emps);
    }
}
