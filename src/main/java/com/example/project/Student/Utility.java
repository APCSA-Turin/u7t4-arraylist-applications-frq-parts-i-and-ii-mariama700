package com.example.project.Student;

import java.util.ArrayList;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> studentsToSort) {
        int n = studentsToSort.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (compareStudents(studentsToSort.get(j), studentsToSort.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Student temp = studentsToSort.get(i);
                studentsToSort.set(i, studentsToSort.get(minIndex));
                studentsToSort.set(minIndex, temp);
            }
        }

        return studentsToSort; 
    }

    private static int compareStudents(Student s1, Student s2) {
        int lastNameComparison = s1.getLastName().compareTo(s2.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        int firstNameComparison = s1.getFirstName().compareTo(s2.getFirstName());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        // Higher GPA should come first
        if (s1.getGpa() > s2.getGpa()) {
            return -1;
        } else if (s1.getGpa() < s2.getGpa()) {
            return 1;
        } else {
            return 0;
        }
    }
}
