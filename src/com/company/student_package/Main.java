package com.company.student_package;

import java.util.List;
import java.util.Random;

public class Main {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        StudentClass<MathStudent> mathStudents = new StudentClass();
        StudentClass<PhysicsStudent> physicsStudents = new StudentClass();

        Random random = new Random();


        for (int i = 0; i < 20; i++) {
            if (random.nextInt() % 2 == 0) {
                mathStudents.addStudent(new MathStudent(random.nextInt(20) + 50, random.nextInt(20) + 30, generateRandomString()));
            } else {
                physicsStudents.addStudent(new PhysicsStudent(random.nextInt(20) + 30, random.nextInt(20) + 50, generateRandomString()));
            }
        }


        System.out.println("UNSORTED. MATH");
//        mathStudents.printStudentNames();
        System.out.println(mathStudents);


        System.out.println("-".repeat(60));
        System.out.println("UNSORTED. PHYSICS");
//        physicsStudents.printStudentNames();
        System.out.println(physicsStudents);


        System.out.println("-".repeat(50));
        System.out.println("SORTED. MATH");

        mathStudents.sortStudentsByMainGrade();
//        mathStudents.printStudentNames();
        System.out.println(mathStudents);

        System.out.println("-".repeat(60));
        System.out.println("SORTED. PHYSICS");

        physicsStudents.sortStudentsByMainGrade();
//        physicsStudents.printStudentNames();
        System.out.println(physicsStudents);


        System.out.println("-".repeat(60));
        System.out.println("ENOUGH GRADE. MATH");
        printStudentsGradeEnough(mathStudents.getStudents());


        System.out.println("-".repeat(60));
        System.out.println("ENOUGH GRADE. PHYSICS");
        printStudentsGradeEnough(physicsStudents.getStudents());

    }

    private static void printStudentsGradeEnough(List<? extends Student> students) {
        students.forEach(item -> {
            try {
                if (!item.checkGradesAreEnough()) {
                    throw new GradeNotEnoughException(item.name + "'s grade is not enough");
                }
                System.out.println(item.name + "'s grade is  enough");
            } catch (GradeNotEnoughException ex) {
                System.out.println(ex.getMessage());
            }
        });
    }

    private static String generateRandomString() {
        int length = new Random().nextInt(10) + 1;
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
