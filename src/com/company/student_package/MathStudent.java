package com.company.student_package;

public class MathStudent extends Student {
    public MathStudent(int mathGrade, int physicsGrade, String name) {
        super(mathGrade, physicsGrade, name);
    }

    @Override
    boolean checkGradesAreEnough() {
        return mathGrade > 60 && physicsGrade > 40;
    }

    @Override
    int getMainCourseGrade() {
        return mathGrade;
    }
}
