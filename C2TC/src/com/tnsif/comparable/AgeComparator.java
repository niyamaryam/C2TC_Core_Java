package com.tnsif.comparable;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int emp1Age = emp1.getAge();
        int emp2Age = emp2.getAge();

        if (emp1Age > emp2Age) {
            return 1;
        } else if (emp1Age < emp2Age) {
            return -1;
        } else {
            return 0;
        }
    }
}
