package studentdatabaseapp;

import java.util.Scanner;

/**
 * Created by Arisa 8/9/2021
 * based on tutorial: https://www.youtube.com/watch?v=GOGt7PACl10
 */
public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask how many users we want to add.
        System.out.print("Enter number of new student to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] studentList = new Student[numOfStudent];

        // Create n number of new student instances.
        for (int n = 0; n< numOfStudent; n++){
            studentList[n] = new Student();
            studentList[n].enroll();
            studentList[n].payTuition();
        }

        System.out.println("\n================Result==================");
        for(Student s: studentList)
            System.out.println(s);

    }
}
