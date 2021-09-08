package studentdatabaseapp;
import java.util.Scanner;

/**
 * Created by Arisa 8/9/2021
 * based on tutorial: https://www.youtube.com/watch?v=GOGt7PACl10
 */
public class Student {

    private String studentId;
    private String firstName;
    private String surName;
    private int gradeYear;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's sur name: ");
        this.surName = in.nextLine();

        System.out.println("1 - freshman\n2 - sophmore\n3 - junior\n4 - senior");
        System.out.print("Enter student's class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }
    // Generate 5-digit id
    private void setStudentID(){
        // Grade level + static id
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){
        String course;
        do {
            System.out.print("Enter the course to enroll (Q to quit!): ");
            Scanner in = new Scanner(System.in);
            course = in.nextLine();
            if (course.toUpperCase() != "Q" && course.length() != 1) {
                courses += course + " ";
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while(true);

        if(!courses.isEmpty())
            System.out.println("Enrolled in " + courses);
        else
            System.out.println("You enrolled no class.");
    }

    // View balance
    public void viewBalance(){
        System.out.println("Total balance of " + firstName +  " " + surName +
                "(" + studentId + ") is $" + tuitionBalance);
    }

    // Pay tuition fees for each course
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
    }

    // Show status
    @Override
    public String toString() {
        return firstName + ' ' + surName + '(' + studentId + ")" +
                "\nGrade level: " + gradeYear +
                "\nCourses Enroled: " + courses +
                "\nTuitionBalance: $" + tuitionBalance;
    }
}
