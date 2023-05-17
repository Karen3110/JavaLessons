package com.company.student_package;

public abstract class Student {
    protected int mathGrade;
    protected int physicsGrade;
    protected String name;

    public Student(int mathGrade, int physicsGrade, String name) {
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.name = name;
    }

    abstract boolean checkGradesAreEnough();

    abstract int getMainCourseGrade();

    @Override
    public String toString() {
        return "\nStudent{" +
                "mathGrade=" + mathGrade +
                ", physicsGrade=" + physicsGrade +
                ", name='" + name + '\'' +
                "}";
    }
}
