package com.company.student_package;

public class PhysicsStudent extends Student {
    public PhysicsStudent(int mathGrade, int physicsGrade, String name) {
        super(mathGrade, physicsGrade, name);
    }

    @Override
    boolean checkGradesAreEnough() {
        return physicsGrade > 60 && mathGrade > 40;
    }

    @Override
    int getMainCourseGrade() {
        return physicsGrade;
    }
}
