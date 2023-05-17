package com.company.student_package;

import java.util.*;

public class StudentClass<T extends Student> {

    private List<T> students;


    public void addStudent(T student) {
        if (students == null) {
            students = new LinkedList<>();
        }
        if (student != null) {
            students.add(student);
        }
    }

    public void sortStudentsByMainGrade() {
/*
        students.sort(new Comparator<T>() {
            @Override
            public int compare(T val1, T val2) {
                return val1.getMainCourseGrade() - val2.getMainCourseGrade();
            }
        });
*/

/*
        students.sort((val1, val2) -> val1.getMainCourseGrade() - val2.getMainCourseGrade());
*/
/*
        students.sort(Comparator.comparingInt(Student::getMainCourseGrade));
 */
        Collections.sort(students, new Comparator<T>() {
            @Override
            public int compare(T val1, T val2) {
                return val1.getMainCourseGrade() - val2.getMainCourseGrade();
            }
        });
    }

    public void printStudentNames() {
        Iterator<T> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name);
        }
    }

    @Override
    public String toString() {
        return "" + students;
    }

    public List<T> getStudents() {
        return students;
    }
}
